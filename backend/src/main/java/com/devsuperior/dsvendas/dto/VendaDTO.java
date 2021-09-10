package com.devsuperior.dsvendas.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.devsuperior.dsvendas.entities.Venda;

public class VendaDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Integer visitado;
	private Integer fechado;
	private Double valor;
	private LocalDate data;	

	private VendedorDTO vendedor;
	
	public VendaDTO() {
	}

	public VendaDTO(Long id, Integer visitado, Integer fechado, Double valor, LocalDate data, VendedorDTO vendedor) {
		this.id = id;
		this.visitado = visitado;
		this.fechado = fechado;
		this.valor = valor;
		this.data = data;
		this.vendedor = vendedor;
	}
	
	public VendaDTO(Venda entity) {
		id = entity.getId();
		visitado = entity.getVisitado();
		fechado = entity.getFechado();
		valor = entity.getValor();
		data = entity.getData();
		vendedor = new VendedorDTO(entity.getVendedor());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisitado() {
		return visitado;
	}

	public void setVisitado(Integer visitado) {
		this.visitado = visitado;
	}

	public Integer getFechado() {
		return fechado;
	}

	public void setFechado(Integer fechado) {
		this.fechado = fechado;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public VendedorDTO getVendedor() {
		return vendedor;
	}

	public void setVendedor(VendedorDTO vendedor) {
		this.vendedor = vendedor;
	}

}
