package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Vendedor;

public class SomaSucessoVendaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nomeVendedor;
	private Long visitado;
	private Long fechado;
	
	public SomaSucessoVendaDTO() {
	}

	public SomaSucessoVendaDTO(Vendedor vendedor, Long visitado, Long fechado) {
		this.nomeVendedor = vendedor.getNome();
		this.visitado = visitado;
		this.fechado = fechado;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	public Long getVisitado() {
		return visitado;
	}

	public void setVisitado(Long visitado) {
		this.visitado = visitado;
	}

	public Long getFechado() {
		return fechado;
	}

	public void setFechado(Long fechado) {
		this.fechado = fechado;
	}
		
}
