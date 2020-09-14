package com.example.swagger2.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author lijun
 * @Description
 * @Date 2020-08-03 2:11 下午
 **/

@Data
@ApiModel("用户对象")
public class UserVO {

    @ApiModelProperty(required = true, notes = "用户ID", example = "1")
    private Integer id;

    @ApiModelProperty(required = true, notes = "姓名", example = "张三")
    private String name;

    @ApiModelProperty(required = true, notes = "手机号", example = "17700000000")
    private String phone;

    @ApiModelProperty(required = true, notes = "性别", example = "男")
    private String sex;

    @ApiModelProperty(required = true, notes = "邮箱", example = "123@163.com")
    private String email;
}
