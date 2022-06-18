package com.mobileapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mobileapp.exception.CategoryNotFoundExeption;

@RestControllerAdvice
public class CategoryControllerAdvice {

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(CategoryNotFoundExeption.class)
	public String exceptionHandlerForCategoryController(Exception e) {
		return e.getMessage();
	}
}
