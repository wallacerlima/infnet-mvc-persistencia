package br.edu.infnet.appestabelecimento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.appestabelecimento.model.domain.Funcionario;
import br.edu.infnet.appestabelecimento.model.service.EstabelecimentoService;
import br.edu.infnet.appestabelecimento.model.service.FuncionarioService;

@Controller
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;
	@Autowired
	private EstabelecimentoService estabelecimentoService;
	
	
	@GetMapping(value = "/funcionario")
	public String cadastro(Model model) {
		
		model.addAttribute("estabelecimentos", estabelecimentoService.obterLista());
		
		return "funcionario/cadastro";
	}
	
	@PostMapping(value = "/funcionario/incluir")
	public String incluir(Funcionario funcionario) {
		
		funcionarioService.incluir(funcionario);
		System.out.println("Inclusão realizada com sucesso: "+funcionario.getNome());
		
		return "redirect:/estabelecimentos";
	}
	
	@PostMapping(value = "/funcionarios/estabelecimento")
	private String lista(Model model, @RequestParam Integer id) {
		
		model.addAttribute("id", id);
		model.addAttribute("lista", funcionarioService.obterLista(id));
		model.addAttribute("estabelecimentos", estabelecimentoService.obterLista());
		
		return "funcionario/lista";
	}
	
	@GetMapping(value = "/funcionarios")
	private String lista(Model model) {
		
		model.addAttribute("estabelecimentos", estabelecimentoService.obterLista());
		
		return "funcionario/lista";
	}
	
}
