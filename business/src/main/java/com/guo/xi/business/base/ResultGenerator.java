package com.guo.xi.business.base;

/**
 * @Author lijun
 * @Description 响应结果生成工具
 * @Date 2020-09-18 9:38 上午
 **/

public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    public static Result getSuccessResult() {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMsg(DEFAULT_SUCCESS_MESSAGE);
    }

    public static <T> Result<T> getSuccessResult(T data) {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMsg(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }

    public static Result getFailResult(String msg) {
        return new Result()
                .setCode(ResultCode.FAIL)
                .setMsg(msg);
    }

    public static Result getErrorResult(String msg) {
        return new Result()
                .setCode(ResultCode.ERROR)
                .setMsg(msg);
    }
}
