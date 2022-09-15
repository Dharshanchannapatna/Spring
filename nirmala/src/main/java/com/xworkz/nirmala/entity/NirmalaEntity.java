package com.xworkz.nirmala.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "nirmala_info")

public class NirmalaEntity {
	@Id
	@GenericGenerator(name = "boss", strategy = "increment")
	@GeneratedValue(generator = "boss")
	@Min(value = 1, message = "ID not found")
	private Integer id;
	@NotNull
	private String location;
	@NotNull
	private String gender;
	@NotNull
	private String type;
	@Min(value = 10, message = "Cost is too less")
	@Max(value = 40, message = "cost is  too more")
	private Double cost;
	@NotNull
	private String duration;
	@NotNull
	private String createdBy;
	@NotNull
	private LocalDate createdDate;
	@NotNull
	private String updatedBy;
	@NotNull
	private LocalDate updatedDate;

	public NirmalaEntity(String location, String gender, String type, Double cost, String duration, String createdBy,
			LocalDate createdDate, String updatedBy, LocalDate updatedDate) {

		this.location = location;
		this.gender = gender;
		this.type = type;
		this.cost = cost;
		this.duration = duration;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.updatedBy = updatedBy;
		this.updatedDate = updatedDate;
	}

}
