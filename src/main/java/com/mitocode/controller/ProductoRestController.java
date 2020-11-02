package com.mitocode.controller;

import java.util.List;

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
@RequestMapping("/restProducto")
public class ProductoRestController {

      @Autowired
	  private IProductoRepo productoRepo; 
      

      @GetMapping()  
	  public List<Producto> getAllProducts(Model model) {	 
    	  return productoRepo.findAll();
	  }  
    
	  @PostMapping
	  public void insertar(@RequestBody Producto pr){
		productoRepo.save(pr);
	  }
	
	  @PutMapping
	  public void modificar(@RequestBody Producto pr){
		productoRepo.save(pr);		
	  }

	  @DeleteMapping(value = "/{id}")
	  public void eliminar(@PathVariable("id") Integer id) {
		productoRepo.deleteById(id);
	  }
}
