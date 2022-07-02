package br.edu.infnet.appvotacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appvotacao.model.domain.Eleicao;
import br.edu.infnet.appvotacao.model.service.EleicaoService;

@Controller
public class EleicaoController {
	
	@Autowired
	private EleicaoService eleicaoService;
	
	@GetMapping(value = "/eleicao")
	public String cadastro() {
		return "eleicao/cadastro";
	}
	
	@PostMapping(value = "/eleicao/incluir")
	public String incluir(Eleicao eleicao) {
		
		eleicaoService.incluir(eleicao);
		System.out.println("Inclusão realizada com sucesso: "+eleicao.getDescricao());
		
		return "redirect:/eleicoes";
	}
	
	@GetMapping(value = "/eleicoes")
	private String lista(Model model) {
		
		model.addAttribute("lista", eleicaoService.obterLista());
		
		return "eleicao/lista";
	}
	
	@GetMapping(value = "/eleicao/{id}/excluir")
	private String excluir(@PathVariable Integer id) {
		eleicaoService.excluir(id);
		return "redirect:/eleicoes";
	}
}
