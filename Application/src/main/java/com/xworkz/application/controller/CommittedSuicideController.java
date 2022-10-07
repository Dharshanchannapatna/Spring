package com.xworkz.application.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.application.dto.SuicideDTO;

@Component
@RequestMapping("/")
public class CommittedSuicideController {
	public CommittedSuicideController() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	@RequestMapping("/create.do")
	private String onCreated(SuicideDTO suicideDTO,Model model,HttpServletRequest request) {
		System.out.println("Calling onCreated");
		System.out.println("Fecthing Data from Dto"+suicideDTO);
		model.addAttribute("name", "Displaying all Data");
		model.addAttribute("DTO", suicideDTO);
		request.setAttribute("type", "This is A type");
		
		
		return "index.jsp";
		
	}

}
