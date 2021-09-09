package com.devsuperior.dsvendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Venda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer visitado;
	private Integer fechado;
	private Double valor;
	private LocalDate data;	
	
	@ManyToOne
	@JoinColumn(name = "vendedor_id")
	private Vendedor vendedor;
	
	public Venda() {
	}

	public Venda(Long id, Integer visitado, Integer fechado, Double valor, LocalDate data, Vendedor vendedor) {
		this.id = id;
		this.visitado = visitado;
		this.fechado = fechado;
		this.valor = valor;
		this.data = data;
		this.vendedor = vendedor;
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

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	
}
