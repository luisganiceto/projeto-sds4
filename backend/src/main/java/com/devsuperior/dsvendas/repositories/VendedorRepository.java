package com.devsuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas.entities.Vendedor;

public interface VendedorRepository extends JpaRepository<Vendedor, Long> {

}
