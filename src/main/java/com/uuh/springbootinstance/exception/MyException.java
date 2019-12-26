package com.uuh.springbootinstance.exception;

/**
 * @author cg
 * @description 自定义异常
 * @date 2019/12/20 16:15
 * @since 1.0
 */
public class MyException extends Exception{

    public MyException(String message) {
        super(message);
    }
}