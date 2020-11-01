package com.mitocode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Producto;
import com.mitocode.repo.IProductoRepo;

@RestController
@RequestMapping("/productos")
public class ProductController {

      @Autowired
	  private IProductoRepo repo;
      
      @GetMapping("/todos")  
	  public String getAllProducts(Model model) {	 
 		model.addAttribute("products",repo.findAll());
 		
		  return "product_all";
	  }
     
      @GetMapping("/{productId}")
      public String getProductById(Model model, @PathVariable("productId") int productId) {
    	 
    	  model.addAttribute("product",repo.findById(productId));
    	  return "product";
      }
      
  	  @PostMapping
  	  public void insertar(@RequestBody Producto pr){
  		  repo.save(pr);
  	  }
  	
  	  @PutMapping
  	  public void modificar(@RequestBody Producto pr){
  	   	  repo.save(pr);		
  	  }

  	  @DeleteMapping(value = "/delete/{id}")
  	  public void eliminar(@PathVariable("id") Integer id) {
  		  repo.deleteById(id);
  	  }
}