package com.guo.xi.business.base;

import lombok.Data;

/**
 * @Author lijun
 * @Description 接口统一返回类
 * @Date 2020-09-18 9:25 上午
 **/

@Data
public class Result<T> {
    private String code;

    private String msg;

    private T data;

    public Result setCode(ResultCode resultCode) {
        this.code = resultCode.code();
        return this;
    }

    public Result setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Result setData(T data) {
        this.data = data;
        return this;
    }
}
