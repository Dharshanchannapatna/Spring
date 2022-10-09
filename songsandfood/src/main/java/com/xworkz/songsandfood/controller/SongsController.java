package com.xworkz.songsandfood.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.songsandfood.dto.SongsDTO;

@Component
@RequestMapping("/")
public class SongsController {
	Collection<SongsDTO> songsDTOs = new ArrayList<SongsDTO>();
	

	public SongsController() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}
@RequestMapping("/song.do")
	public String songAdd(SongsDTO songsDTO, Model model) {
		System.out.println("Calling songAdd");
		System.out.println("Fatching the SongsDto details" + songsDTO);
		model.addAttribute("SongsDTOs", songsDTO);
		boolean add = songsDTOs.add(songsDTO);
		System.out.println(add);
		return "Songs.jsp";

	}
@RequestMapping("/songsDisplay.do")
	public String viewSongs(Model model) {
		System.out.println("Calling viewSongs");
		model.addAttribute("list", this.songsDTOs);
		return "DisplaySongs.jsp";
		
	}

}
