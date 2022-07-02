package br.edu.infnet.appestabelecimento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.appestabelecimento.model.domain.Estabelecimento;
import br.edu.infnet.appestabelecimento.model.service.EstabelecimentoService;

@Controller
public class EstabelecimentoController {
	
	@Autowired
	private EstabelecimentoService estabelecimentoService;
	
	@GetMapping(value = "/estabelecimento")
	public String cadastro() {
		return "estabelecimento/cadastro";
	}
	
	@PostMapping(value = "/estabelecimento/incluir")
	public String incluir(Estabelecimento estabelecimento) {
		
		estabelecimentoService.incluir(estabelecimento);
		System.out.println("Inclusão realizada com sucesso: "+estabelecimento.getNome());
		
		return "redirect:/usuarios";
	}
}
