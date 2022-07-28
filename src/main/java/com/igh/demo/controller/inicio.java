package com.igh.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class inicio {
	@RequestMapping("/")
	String inicio() {
		return "index";
	}

}
