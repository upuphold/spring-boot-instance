package com.uuh.springbootinstance.exception;

import lombok.Data;

/**
 * @author cg
 * @description 异常信息类
 * @date 2019/12/20 16:13
 * @since 1.0
 */
@Data
public class ErrorInfo<T> {
    public static final Integer OK = 1;
    public static final Integer FAIL = 0;
    private Integer code;
    private String message;
    private String url;
    private T data;
}