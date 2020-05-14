package com.marcocorp.catalogojogos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "tbl_jogo")
public class Jogo {
	@Column(name = "id") 									// especifico o nome da coluna
	@Id														// digo que é chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY)		// eh o valor gerado pelo banco de dados
	private int id;
	
	@Column(name = "nome", length = 100)
	private String nome;
	
	@Column(name = "classificacao")
	private String classificacao;
	
	@Column(name = "plataforma", length = 40)
	private String plataforma;
	
	@Column(name = "descicao", length = 200)
	private String descricao;
	
	@Column(name = "preco")
	private float preco;
	 
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	

}
