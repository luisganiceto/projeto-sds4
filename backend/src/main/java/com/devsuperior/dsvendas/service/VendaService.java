package com.devsuperior.dsvendas.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dsvendas.dto.SomaSucessoVendaDTO;
import com.devsuperior.dsvendas.dto.SomaVendaDTO;
import com.devsuperior.dsvendas.dto.VendaDTO;
import com.devsuperior.dsvendas.entities.Venda;
import com.devsuperior.dsvendas.repositories.VendaRepository;
import com.devsuperior.dsvendas.repositories.VendedorRepository;

@Service
public class VendaService {

	@Autowired
	private VendaRepository repository;
	
	@Autowired
	private VendedorRepository vendedorRepository;
	
	@Transactional(readOnly = true)
	public Page<VendaDTO> buscarTodos(Pageable pageable){
		vendedorRepository.findAll();
		Page<Venda> result = repository.findAll(pageable);
		return result.map(x -> new VendaDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SomaVendaDTO> totalVendidoPorVendedor(){
		return repository.totalVendidoPorVendedor();
	}
	
	@Transactional(readOnly = true)
	public List<SomaSucessoVendaDTO> taxaDeSucesso(){
		return repository.taxaDeSucesso();
	}
	
}
