package com.uuh.springbootinstance.exception;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cg
 * @description
 * @date 2019/12/20 16:16
 * @since 1.0
 */
@RestController
public class ExceptionController {

    @RequestMapping("/exception")
    public String exceptionJson() throws MyException{
        throw new MyException("访问错误");
    }

}