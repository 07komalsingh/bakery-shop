package com.sheryians.major.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sheryians.major.model.Category;
import com.sheryians.major.model.Product;
import com.sheryians.major.repository.CategoryRepository;
import com.sheryians.major.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProduct(){
		return productRepository.findAll();
	}
	public void addProduct(Product product) {
		productRepository.save(product);
	}
	
	public void removeProductById(long id) {
		productRepository.deleteById(id);
	}
	
	public Optional<Product> getProductById(long id){
		return productRepository.findById(id);
	}
	
	/*
	 * public List<Product> getAllProductsByCategoryId(int id){ return
	 * productRepository.findAllByCateory_Id(id); }
	 */
}
