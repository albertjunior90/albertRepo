package com.mitocode;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.mitocode.model.Usuario;
import com.mitocode.repo.IUsuarioRepo;

@SpringBootTest
class DemoWebApplicationTests {

	@Autowired
	IUsuarioRepo repo;

	@Autowired
	private BCryptPasswordEncoder encoder;
	
	
	@Test
	void crearUsuarioTest() {
		Usuario us = new Usuario();
		us.setId(4);
		us.setNombre("codex");
		us.setClave(encoder.encode("123"));
		Usuario retorno = repo.save(us);
		
		assert(retorno.getClave().equalsIgnoreCase(us.getClave()));
	}

}
