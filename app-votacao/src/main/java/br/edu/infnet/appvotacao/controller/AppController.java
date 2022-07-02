package br.edu.infnet.appvotacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping(value="/")
	private String index() {
		return "index";
	}
}
