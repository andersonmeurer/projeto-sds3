package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entity.Seller;
import com.sun.source.doctree.SerialDataTree;

public class SaleSumDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String sellerSum;
	private Double sum;

	public SaleSumDTO() {
	}

	public SaleSumDTO(Seller seller, Double sum) {
		this.sellerSum = seller.getName();
		this.sum = sum;
	}

	public String getSellerSum() {
		return sellerSum;
	}

	public void setSellerSum(String sellerSum) {
		this.sellerSum = sellerSum;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
}