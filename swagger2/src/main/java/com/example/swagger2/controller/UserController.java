package com.example.swagger2.controller;

import com.example.swagger2.base.RequestModel;
import com.example.swagger2.base.ResponseModel;
import com.example.swagger2.vo.UpdatePasswordVO;
import com.example.swagger2.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lijun
 * @Description
 * @Date 2020-07-31 2:42 下午
 **/

@RestController
@RequestMapping("/Hello")
@Api(tags = "用户管理模块")
public class UserController {

    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    @ApiOperation(value = "根据用户编号获取用户信息", notes = "test: 仅1和2有正确返回")
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功"),
            @ApiResponse(code = 500, message = "联系开发人员调试")
    })
    @ApiImplicitParam(paramType = "query", name = "id", value = "用户编号", required = true, dataType = "Integer")
    public ResponseModel<UserVO> getUserInfo(@RequestParam Integer id) {
        ResponseModel<UserVO> response = new ResponseModel<>();
        UserVO userInfo = new UserVO();
        if (id == 1) {
            userInfo.setId(1);
            userInfo.setName("张三");
            userInfo.setPhone("17789891212");
            userInfo.setEmail("123456@qq.com");
            userInfo.setSex("男");
            response.setCode("0000");
            response.setMsg("成功");
            response.setData(userInfo);
            return response;
        } else if (id == 2) {
            userInfo.setId(1);
            userInfo.setName("李四");
            userInfo.setPhone("17789891234");
            userInfo.setEmail("123478@qq.com");
            userInfo.setSex("女");
            response.setCode("0000");
            response.setMsg("成功");
            response.setData(userInfo);
            return response;
        } else {
            response.setCode("9999");
            response.setMsg("失败");
            return response;
        }
    }

    @RequestMapping(value = "/updatePassword", method = RequestMethod.POST)
    @ApiOperation(value = "修改用户密码", notes = "根据用户id修改密码")
    @ApiResponses({
            @ApiResponse(code = 200, message = "成功"),
            @ApiResponse(code = 500, message = "联系开发人员调试")
    })
    public ResponseModel<Object> updatePassword(@RequestBody RequestModel<UpdatePasswordVO> request) {
        ResponseModel<Object> response = new ResponseModel<>();
        if (request.getData().getUserId() <= 0 || request.getData().getUserId() > 2) {
            response.setCode("0001");
            response.setMsg("请求参数没填好");
            return response;
        }
        if (StringUtils.isEmpty(request.getData().getPassword()) || StringUtils.isEmpty(request.getData().getPassword())) {
            response.setCode("0002");
            response.setMsg("密码不能为空");
            return response;
        }
        if (request.getData().getPassword().equals(request.getData().getNewPassword())) {
            response.setCode("0003");
            response.setMsg("新旧密码不能相同");
            return response;
        }
        response.setCode("0000");
        response.setMsg("成功");
        return response;
    }
}
