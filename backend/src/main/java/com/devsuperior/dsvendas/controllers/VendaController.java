package com.devsuperior.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SomaSucessoVendaDTO;
import com.devsuperior.dsvendas.dto.SomaVendaDTO;
import com.devsuperior.dsvendas.dto.VendaDTO;
import com.devsuperior.dsvendas.service.VendaService;

//--- localhost:8080/vendas?page=1&size=50&sort=valor

@RestController
@RequestMapping(value = "/vendas")
public class VendaController {
	
	@Autowired
	private VendaService service;
	
	@GetMapping
	public ResponseEntity<Page<VendaDTO>> buscarTodos(Pageable pageable){
		Page<VendaDTO> list = service.buscarTodos(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/soma-por-vendedor")
	public ResponseEntity<List<SomaVendaDTO>> totalVendidoPorVendedor(){
		List<SomaVendaDTO> list = service.totalVendidoPorVendedor();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/soma-taxa-sucesso")
	public ResponseEntity<List<SomaSucessoVendaDTO>> taxaDeSucesso(){
		List<SomaSucessoVendaDTO> list = service.taxaDeSucesso();
		return ResponseEntity.ok(list);
	}

}
