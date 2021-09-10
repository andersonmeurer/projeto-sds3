package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entity.Seller;
import com.sun.source.doctree.SerialDataTree;

public class SaleSuccessDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String seller;
	private Double visited;
	private Long deals;

	public SaleSuccessDTO() {
	}

	public SaleSuccessDTO(Seller seller, Double visited, Long deals) {
		this.seller = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}
	
	public String getSellerName() {
		return seller;
	}

	public void setSellerName(String sellerName) {
		this.seller = sellerName;
	}

	public Double getVisited() {
		return visited;
	}

	public void setVisited(Double visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}