package br.edu.infnet.appvotacao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.appvotacao.model.domain.Eleicao;
import br.edu.infnet.appvotacao.model.domain.Voto;
import br.edu.infnet.appvotacao.model.service.CandidatoService;
import br.edu.infnet.appvotacao.model.service.EleicaoService;
import br.edu.infnet.appvotacao.model.service.EleitorService;
import br.edu.infnet.appvotacao.model.service.VotoService;

@Controller
public class VotoController {
	
	@Autowired
	private VotoService votoService;
	@Autowired
	private EleitorService eleitorService;
	@Autowired
	private EleicaoService eleicaoService;
	@Autowired
	private CandidatoService candidatoService;
	
	@GetMapping(value = "/voto")
	public String cadastro(Model model, @RequestParam Integer idEleicao) {
		
		Eleicao eleicao = eleicaoService.obterPorId(idEleicao);
		model.addAttribute("eleitores", eleitorService.obterLista());
		model.addAttribute("candidatos", candidatoService.obterPorEleicao(eleicao));
		model.addAttribute("eleicao", eleicao);

		return "voto/cadastro";
	}
	
	@PostMapping(value = "/voto/incluir")
	public String incluir(Voto voto) {
		
		votoService.incluir(voto);
		System.out.println("Inclusão realizada com sucesso: "+voto.getLocalizacao());
		
		return "redirect:/votos";
	}
	
	
	@GetMapping(value = "/votos")
	private String lista(Model model) {
		
		model.addAttribute("lista", votoService.obterLista());
		model.addAttribute("eleicoes", eleicaoService.obterLista());
		
		return "voto/lista";
	}

	@GetMapping(value = "/voto/{id}/excluir")
	private String excluir(@PathVariable Integer id) {
		votoService.excluir(id);
		return "redirect:/votos";
	}
}
