package com.devsuperior.dsvendas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsvendas.dto.SomaSucessoVendaDTO;
import com.devsuperior.dsvendas.dto.SomaVendaDTO;
import com.devsuperior.dsvendas.entities.Venda;

public interface VendaRepository extends JpaRepository<Venda, Long> {

	@Query("select new com.devsuperior.dsvendas.dto.SomaVendaDTO(obj.vendedor, sum(obj.valor)) "
			+ " from Venda as obj group by obj.vendedor")
	List<SomaVendaDTO> totalVendidoPorVendedor();
	
	@Query("select new com.devsuperior.dsvendas.dto.SomaSucessoVendaDTO(obj.vendedor, sum(obj.visitado), sum(obj.fechado)) "
			+ " from Venda as obj group by obj.vendedor")
	List<SomaSucessoVendaDTO> taxaDeSucesso();
}
