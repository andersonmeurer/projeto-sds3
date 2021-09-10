package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entity.Seller;

public class SellerDTO {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;

	public SellerDTO() {
		// TODO Auto-generated constructor stub
	}

	public SellerDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public SellerDTO(Seller seller) {
		this.id = seller.getId();
		this.name = seller.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}