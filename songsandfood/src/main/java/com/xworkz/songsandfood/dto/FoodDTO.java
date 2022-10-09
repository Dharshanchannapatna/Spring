package com.xworkz.songsandfood.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FoodDTO {
	private String itemName;
	private Double price;
	private String hotelName;
	private String type;
	private String location;
	private String ordered;
	private Integer quantity;

}
