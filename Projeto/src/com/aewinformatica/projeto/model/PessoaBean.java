package com.aewinformatica.projeto.model;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PessoaBean {

	String nome;
	String sobrenome;
	String nomeCompleto;
	
	public PessoaBean() {
		
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getNomeCompleto() {
		return nomeCompleto;
	}


	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}


	public void dizerOla() {
		this.nomeCompleto = (this.nome.toUpperCase()
				    + " " +  this.sobrenome.toUpperCase());
	}
}
