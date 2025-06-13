package com.subham.admin.controller;

import com.subham.entity.Product;
import com.subham.repository.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/product")
@CrossOrigin(origins = "http://localhost:2606")
public class AdminProductController {

    @Autowired
    private ProductDAO productRepo;

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return productRepo.save(product);
    }

    @PutMapping("/update/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {
        Product existingProduct = productRepo.findById(id).orElseThrow();
        existingProduct.setName(updatedProduct.getName());
        existingProduct.setDescription(updatedProduct.getDescription());
        existingProduct.setPrice(updatedProduct.getPrice());
       // existingProduct.setQuantity(updatedProduct.getQuantity());
        return productRepo.save(existingProduct);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        productRepo.deleteById(id);
        return "Product deleted with ID: " + id;
    }
}
