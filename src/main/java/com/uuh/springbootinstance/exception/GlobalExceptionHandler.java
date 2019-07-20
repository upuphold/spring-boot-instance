package com.uuh.springbootinstance.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Description: 全局异常处理
 * Date: 2019年07月21日 1:50
 * Author: cg
 * Version: 1.0
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler
	public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception e) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("exception", e);
		modelAndView.addObject("url", request.getRequestURI());
		modelAndView.setViewName("errorPage");
		return modelAndView;
	}
}
