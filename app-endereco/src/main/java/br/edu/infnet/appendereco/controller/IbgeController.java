package br.edu.infnet.appendereco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appendereco.model.service.IbgeService;

@Controller
public class IbgeController {
	
	@Autowired
	private IbgeService ibgeService;
	
	@GetMapping(value="/estados")
	public String listarEstados(Model model) {
		model.addAttribute("lista", ibgeService.obterEstados());
		return "estado/lista";
	}
	
	@GetMapping(value="/municipio/{uf}")
	public String listarMunicipios(Model model, @PathVariable String uf) {
		model.addAttribute("uf", uf);
		model.addAttribute("lista", ibgeService.obterMunicipios(uf));
		return "municipio/lista";
	}

}
