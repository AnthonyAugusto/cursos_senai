package com.anthony.senai.demo.domain.enuns;

import com.anthony.senai.demo.domain.enuns.TipoCliente;

public enum TipoCliente {
	/* Será nosso estáto*/
	PESSOAFISICA(1, "Pessoa física"), PESSOAJURIDICA(2, "Pessoa Jurídica");
	
	/*Nossos atributos*/
	private int cod;
	private String descricao;
	
	/*Construtor*/
	private TipoCliente(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
		
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoCliente toEnum(Integer cod)
	{
		if (cod ==null) {
			return null;
		}
		for (TipoCliente x : TipoCliente.values()) {
			if (cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id Inválido" + cod);
	}
	
}
