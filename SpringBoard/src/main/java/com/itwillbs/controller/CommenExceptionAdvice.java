package com.itwillbs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/*
 	예외 처리(보조기능)를 수행하는 객체
 */

@ControllerAdvice
public class CommenExceptionAdvice {
	
	
	private static final Logger logger = LoggerFactory.getLogger(CommenExceptionAdvice.class);
	
//	@ExceptionHandler(NullPointerException.class)
	@ExceptionHandler(Exception.class)
	public String testException(Exception e, Model model) {
		
		logger.debug("Exception(예외) 발생");
		logger.debug("testException() 호출");
		logger.debug("e : "+ e);
		
		model.addAttribute("e", e);

		
		return "commonException";
		
	}
	
	@ExceptionHandler(Exception.class)
	public ModelAndView testException2(Exception e, Model model) {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/commonException");
		mav.addObject("e", e);
		
		return mav;
		
	}
	
}
