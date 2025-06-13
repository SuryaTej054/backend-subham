package com.subham.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.subham.entity.Product;
import com.subham.repository.ProductDAO;

@RestController
@RequestMapping("/api/product")
@CrossOrigin(origins = "http://localhost:2606") // Allow frontend access
public class ProductController {
	
	@Autowired
	private ProductDAO productRepo;

	@GetMapping("/getAll")
	public List<Product> getAllProducts(){
		return productRepo.findAll();
	}
	/*
	* @PathVariable binds {id} from URL to 'id' parameter
    * productRepo.findById(id) returns an Optional<Product>
    * .orElse(null) returns the Product if found, otherwise returns null.
    * For a more robust API, consider throwing a 404 Not Found if the product doesn't exist:
	*/
	@GetMapping("/{id}") // Maps GET requests like /api/product/123
    public Product getProductById(@PathVariable Long id){ 
        return productRepo.findById(id).orElseThrow(() -> new ResponseStatusException (HttpStatus.NOT_FOUND, "Product not found with ID: " + id));
	}
	@PostMapping
	public Product createProducts(@RequestBody Product product){
		return productRepo.save(product);
	}
}
