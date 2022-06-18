package com.mobileapp.service;

import java.util.List;

import com.mobileapp.entity.Category;
import com.mobileapp.exception.CategoryNotFoundExeption;

public interface CategoryService {
	Category addCategory(Category category) throws CategoryNotFoundExeption;
	Category updateCategory(Category category) throws CategoryNotFoundExeption;
	
	Category getCategoryById(Integer id)throws CategoryNotFoundExeption;
	Category deleteCategoryById(Integer id)throws CategoryNotFoundExeption;
	List<Category> getAllCategory();

}
