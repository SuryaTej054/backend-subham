package com.subham.service;

import java.util.List;

import com.subham.entity.Category;

public interface CategoryService {
	Category addCategory(Category category);
	List<Category> getAllCategies();
	Category getCategoryById(long id);
	void deleteCategory(long id);
}
