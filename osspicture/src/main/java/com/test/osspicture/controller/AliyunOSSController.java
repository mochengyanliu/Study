package com.test.osspicture.controller;

import com.test.osspicture.util.AliyunOSSUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/oss")
public class AliyunOSSController {

    @Autowired
    private AliyunOSSUtil aliyunOSSUtil;

    @RequestMapping(value = "upload")
    public String upload() {
        return "upload.html";
    }

    @RequestMapping(value = "uploadFile")
    public String upLoad(@RequestParam("file")MultipartFile file, Model model) {
        String fileName = file.getOriginalFilename();
        System.out.println(fileName);
        try {
            if (file != null) {
                if (!"".equals(fileName.trim())) {
                    File newFile = new File(fileName);
                    FileOutputStream os = new FileOutputStream(newFile);
                    os.write(file.getBytes());
                    os.close();
                    file.transferTo(newFile);
                    // 上传到OSS
                    String uploadUrl = aliyunOSSUtil.upLoad(newFile);
                    model.addAttribute("url", uploadUrl);
                    newFile.delete();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "uploadSuccess.html";
    }

    @RequestMapping(value = "download")
    public String download(@RequestParam("fileName")String fileName) {
        aliyunOSSUtil.downloadFile(fileName);
        return "downSuccess.html";
    }

    @RequestMapping(value = "listFile")
    public String listFile(Model model) {
        List<Map<String, Object>> list = aliyunOSSUtil.listFile();
        model.addAttribute("list", list);
        return "listFile.html";
    }

    @RequestMapping(value = "deleteFile")
    public String deleteFile(@RequestParam("fileName")String fileName) {
        aliyunOSSUtil.deleteFile(fileName);
        return "deleteSuccess.html";
    }
}
