package com.codingdojo.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mainController {
	
	@GetMapping("/")
	public String index() {
		return "redirect:/omikuji";
	}
	
	@GetMapping("/omikuji")
	public String omikuji() {
		return "omikujiForm.jsp";
	}
	
	
	@PostMapping("/omikujiForm")
	public String omikujiForm(
			@RequestParam(value="number") int number,
			@RequestParam(value="cityName") String cityName,
			@RequestParam(value="personName") String personName,
			@RequestParam(value="hobby") String hobby,
			@RequestParam(value="livingThing") String livingThing,
			@RequestParam(value="somethingNice") String somethingNice,
			HttpSession session
			) {
		session.setAttribute("number", number);
		session.setAttribute("cityName", cityName);
		session.setAttribute("personName", personName);
		session.setAttribute("hobby", hobby);
		session.setAttribute("livingThing", livingThing);
		session.setAttribute("somethingNice", somethingNice);
		return "redirect:/omikuji/show";
	}
	
	
	
	@GetMapping("/omikuji/show")
	public String showOmikuji() {
		return "showOmikuji.jsp";
	}

}
