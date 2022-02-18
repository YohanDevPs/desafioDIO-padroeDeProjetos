package model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import enums.Categorias;

@Entity
public class Moveis {
	
	@Id
	private String codigoMoveis;
	private Integer quantidade;
	private Double preco;
	private String nome;
	@Enumerated(EnumType.STRING)
	private Categorias categorias;
	
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public String getCodigoMoveis() {
		return codigoMoveis;
	}
	public void setCodigoMoveis(String codigoMoveis) {
		this.codigoMoveis = codigoMoveis;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Categorias getCategorias() {
		return categorias;
	}
	public void setCategorias(Categorias categorias) {
		this.categorias = categorias;
	}
	
	
	
	

}
