package com.example.swagger2.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author lijun
 * @Description
 * @Date 2020-08-03 2:17 下午
 **/
@Data
@ApiModel("修改密码对象")
public class UpdatePasswordVO {

    @ApiModelProperty(required = true, notes = "用户ID", example = "1")
    private Integer userId;

    @ApiModelProperty(required = true, notes = "旧密码", example = "123")
    private String password;

    @ApiModelProperty(required = true, notes = "老密码", example = "134")
    private String newPassword;

}
