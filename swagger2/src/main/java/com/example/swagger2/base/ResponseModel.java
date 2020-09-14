package com.example.swagger2.base;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Author lijun
 * @Description 通用接口返回类
 * @Date 2020-08-03 1:34 下午
 **/

@Data
@ApiModel("通用接口返回对象")
public class ResponseModel<T> {
    @ApiModelProperty(required = true, notes = "结果码", example = "0000")
    private String code;

    @ApiModelProperty(required = true, notes = "结果信息", example = "成功")
    private String msg;

    @ApiModelProperty(required = true, notes = "返回数据", example = "{\"name\":\"admin\"}")
    private T data;
}
