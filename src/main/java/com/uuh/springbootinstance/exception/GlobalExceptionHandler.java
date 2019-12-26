package com.uuh.springbootinstance.exception;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author cg
 * @description 全局异常处理
 * @date 2019/12/20 15:32
 * @since 1.0
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {


    /*返回error的json数据*/
    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ErrorInfo<String> defaultExceptionHandler(HttpServletRequest request, Exception e) throws Exception{
        ErrorInfo<String> res = new ErrorInfo<>();
        res.setCode(ErrorInfo.FAIL);
        res.setMessage(e.getMessage());
        res.setUrl(request.getRequestURI());
        return res;
    }


    /*返回error页面*/
/*    @ExceptionHandler(value = Exception.class)
    public String defaultExceptionHandler(HttpServletRequest request, Exception e) {
        ModelMap modelMap = new ModelMap();
        modelMap.addAttribute("url", request.getRequestURI());
        modelMap.addAttribute("exception", e.getMessage());
        return "error";
    }*/

}