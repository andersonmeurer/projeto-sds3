package com.devsuperior.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsvendas.entity.Sale;

public interface SeleRepository extends JpaRepository<Sale, Long> {
	
	

}
