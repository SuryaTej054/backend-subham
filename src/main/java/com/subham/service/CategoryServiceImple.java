package com.subham.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subham.entity.Category;
import com.subham.repository.CategoryDAO;

@Service
public class CategoryServiceImple implements CategoryService{
	@Autowired
	private CategoryDAO categoryRepo;

	@Override
	public Category addCategory(Category category) {
		return categoryRepo.save(category);
	}

	@Override
	public List<Category> getAllCategies() {
		return categoryRepo.findAll();
	}

	@Override
	public Category getCategoryById(long id) {
		return categoryRepo.findById(id).orElse(null);
	}

	@Override
	public void deleteCategory(long id) {
		categoryRepo.deleteById(id);
	}
}
