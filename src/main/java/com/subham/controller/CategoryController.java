package com.subham.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subham.entity.Category;
import com.subham.service.CategoryService;

@RestController
@CrossOrigin(origins = "http://localhost:2606")
@RequestMapping("/api/category")
public class CategoryController {
	@Autowired
	private CategoryService categoryServ;
	
	@PostMapping("/add")
	public Category addCategies(@RequestBody Category category) {
		return categoryServ.addCategory(category);
	}
	@GetMapping("/all")
	public List<Category> getAllCategies(){
		return categoryServ.getAllCategies();
	}
	@GetMapping("/{id}")
	public Category getCategoryById(@PathVariable long id){
		return categoryServ.getCategoryById(id);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteCategoryById(@PathVariable long id) {
		categoryServ.deleteCategory(id);
	}
}
