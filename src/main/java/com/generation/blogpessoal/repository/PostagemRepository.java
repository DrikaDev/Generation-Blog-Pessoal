package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.blogpessoal.model.Postagem;

//não implementa nada na interface!
//criar a herança:
public interface PostagemRepository extends JpaRepository<Postagem, Long>{

	//metodo query na PostagemController.java
	public List<Postagem> findAllByTituloContainingIgnoreCase(@Param("titulo") String titulo);
}
