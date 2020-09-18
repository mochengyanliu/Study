package com.guo.xi.business.base;

/**
 * @Author lijun
 * @Description 服务（业务）异常如“ 账号或密码错误 ”，该异常只做INFO级别的日志记录
 * @Date 2020-09-18 10:26 上午
 **/

public class ServiceException extends RuntimeException {
    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
