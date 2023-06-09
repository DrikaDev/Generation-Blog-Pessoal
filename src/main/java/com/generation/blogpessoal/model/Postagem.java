package com.generation.blogpessoal.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_postagens")
public class Postagem {

	//atributos:
	
	@Id //indica chave-primaria na tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) //indica auto-increment
	private Long id;
	
	@NotBlank(message = "Atributo/campo de preenchimento obrigatório.")
	@Size(min = 5, max = 100, message = "No mínimo 5 e no máximo 100 caracteres")
	private String titulo;
	
	@NotBlank(message = "Atributo/campo de preenchimento obrigatório.")
	@Size(min = 10, max = 1000, message = "No mínimo 10 e no máximo 1000 caracteres")
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data;
	
	//criação da relação many to one:
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;
	//daí chamar o get e set de tema!
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario;
	//daí chamar o get e set de usuario!
	
	//getters & setters

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
