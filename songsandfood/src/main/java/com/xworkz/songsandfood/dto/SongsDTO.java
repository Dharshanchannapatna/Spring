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
public class SongsDTO {
	private String name;
	private String singer;
	private String duration;
	private String producer;
	private String lyrics;
	private String language;
	private String type;


}
