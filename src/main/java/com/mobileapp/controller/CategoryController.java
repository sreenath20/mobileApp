package com.mobileapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mobileapp.entity.Category;
import com.mobileapp.exception.CategoryNotFoundExeption;
import com.mobileapp.service.CategoryService;

@RestController
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping("category")
	public Category addCategory(@RequestBody Category category) throws CategoryNotFoundExeption {
		return this.categoryService.addCategory(category);
	}
	@PutMapping("category")
	public Category updateCategory(@RequestBody Category category) throws CategoryNotFoundExeption {
		return this.categoryService.updateCategory(category);
	}
	@GetMapping("categories")
	public List<Category> getAllCategory(){
		return this.categoryService.getAllCategory();
	}
	@GetMapping("category/{id}")
	public Category getcategoryById(@PathVariable("id") Integer categoryId ) throws CategoryNotFoundExeption {
		return this.categoryService.getCategoryById(categoryId);
	}

}
