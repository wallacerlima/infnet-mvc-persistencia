package br.edu.infnet.appvotacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appvotacao.model.domain.Eleitor;
import br.edu.infnet.appvotacao.model.service.EleitorService;

@Controller 
public class EleitorController {
	
	@Autowired
	private EleitorService eleitorService;
	
	@GetMapping(value = "/eleitor")
	public String cadastro() {
		return "eleitor/cadastro";
	}
	
	@PostMapping(value = "/eleitor/incluir")
	public String incluir(Eleitor eleitor) {
		
		eleitorService.incluir(eleitor);
		System.out.println("Inclusão realizada com sucesso: "+eleitor.getNome());
		
		return "redirect:/eleitores";
	}
	
	@GetMapping(value = "/eleitores")
	private String lista(Model model) {
		
		model.addAttribute("lista", eleitorService.obterLista());
		
		return "eleitor/lista";
	}
	
	@GetMapping(value = "/eleitor/{id}/excluir")
	private String excluir(@PathVariable Integer id) {
		eleitorService.excluir(id);
		return "redirect:/eleitores";
	}

}
