package com.mitocode.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mitocode.repo.IProductoRepo;

@Controller
@RequestMapping("/productos")
public class ProductoController {
	
      @Autowired
	  private IProductoRepo productoRepo;
      
      @GetMapping("/todos")  
	  public String getAllProducts(Model model) {
 		  model.addAttribute("products",productoRepo.findAll()); 		
		  return "product_all";
	  }
     
      @GetMapping("/{productId}")
      public String getProductById(Model model, @PathVariable("productId") int productId) {
    	 
    	  model.addAttribute("product",productoRepo.findById(productId).get());
    	  return "product";
      }      
}
