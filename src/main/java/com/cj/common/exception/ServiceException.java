package com.cj.common.exception;

import java.io.Serializable;

/**
 * @ClassName ServiceException
 * @Description 业务层异常类
 * @Author ChownWang
 * @Date 2020/7/11 11:30
 * @Version 1.0
 */
public class ServiceException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = 1592817737242392169L;

    public ServiceException() {
        super();
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    protected ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
