package com.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.model.Postagem;

//criar a herança:
public interface PostagemRepository extends JpaRepository<Postagem, Long>{

}
