package com.xworkz.metro.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "metro_info")

public class MetroEntity {
	@Id
	private Integer id;
	private String name;
	private String location;
	private Double price;
	private String startPoint;
	private String endPoint;

}
