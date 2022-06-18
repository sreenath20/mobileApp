package com.mobileapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileapp.entity.Category;
import com.mobileapp.exception.CategoryNotFoundExeption;
import com.mobileapp.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private CategoryRepository categoryRepo;
	
	@Override
	public Category addCategory(Category category) throws CategoryNotFoundExeption {
	
		return this.categoryRepo.save(category);
	}

	@Override
	public Category updateCategory(Category category) throws CategoryNotFoundExeption {
		
		return this.categoryRepo.save(category);
	}

	@Override
	public Category getCategoryById(Integer id) throws CategoryNotFoundExeption {
		
		Optional<Category> categoryOpt = this.categoryRepo.findById(id);
		if(categoryOpt.isEmpty())
			throw new CategoryNotFoundExeption("Category Not Found");
		
		return categoryOpt.get();
	}

	@Override
	public Category deleteCategoryById(Integer id) throws CategoryNotFoundExeption {

		return null;
	}

	@Override
	public List<Category> getAllCategory() {
		
		return this.categoryRepo.findAll();
	}

}
