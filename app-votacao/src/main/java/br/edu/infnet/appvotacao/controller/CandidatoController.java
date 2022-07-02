package br.edu.infnet.appvotacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appvotacao.model.domain.Candidato;
import br.edu.infnet.appvotacao.model.service.CandidatoService;
import br.edu.infnet.appvotacao.model.service.EleicaoService;

@Controller
public class CandidatoController {

	@Autowired
	private CandidatoService candidatoService;
	@Autowired
	private EleicaoService eleicaoService;
	
	@GetMapping(value = "/candidato")
	public String cadastro(Model model) {
		model.addAttribute("eleicoes", eleicaoService.obterLista());
		return "candidato/cadastro";
	}
	
	@PostMapping(value = "/candidato/incluir")
	public String incluir(Candidato candidato, Model model) {
		
		try {
			candidatoService.incluir(candidato);
			model.addAttribute("mensagem", candidato.getNome()+" foi cadastrado com sucesso");
		} catch (Exception e) {
		
		}
		return "redirect:/candidatos";
	}
	
	@GetMapping(value = "/candidatos")
	private String lista(Model model) {
		
		model.addAttribute("lista", candidatoService.obterLista());
		
		return "candidato/lista";
	}
	
	@GetMapping(value = "/candidato/{id}/excluir")
	private String excluir(@PathVariable Integer id) {
		candidatoService.excluir(id);
		return "redirect:/candidatos";
	}
	
}
