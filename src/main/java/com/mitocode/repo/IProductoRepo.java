package com.mitocode.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.Producto;
import com.mitocode.model.Usuario;

public interface IProductoRepo extends JpaRepository<Producto, Integer>{
	Usuario findByName(String name);
}
