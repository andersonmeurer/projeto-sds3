package com.devsuperior.dsvendas.entity;

import java.sql.Date;
import java.time.LocalDate;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="tb_sales")
public class Seles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;

	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller seller;
	
	public Seles() {
	}


	public Seles(Long id, Integer visited, Integer deals, Double amount, LocalDate localDate, Seller seller) {
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = localDate;
		this.seller = seller;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void setLocalDate(LocalDate localDate) {
		this.date = localDate;
	}
}