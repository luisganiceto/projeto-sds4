package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Vendedor;

public class SomaVendaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nomeVendedor;
	private Double sum;
	
	public SomaVendaDTO() {
	}

	public SomaVendaDTO(Vendedor vendedor, Double sum) {
		this.nomeVendedor = vendedor.getNome();
		this.sum = sum;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
		
}
