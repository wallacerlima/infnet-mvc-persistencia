package br.edu.infnet.appestabelecimento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.appestabelecimento.model.domain.Usuario;
import br.edu.infnet.appestabelecimento.model.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	
	@GetMapping(value = "/usuarios")
	private String lista(Model model) {
		
		model.addAttribute("lista", usuarioService.obterLista());
		
		return "usuario/lista";
	}
	
	@GetMapping(value = "/usuario/{id}/excluir")
	private String excluir(@PathVariable Integer id) {
		usuarioService.excluir(id);
		return "redirect:/usuarios";
	}
	
	@PostMapping(value = "/usuario/validar")
	private String validar(Model model, @RequestParam String login, @RequestParam String senha) {
		
		Usuario usuario = usuarioService.validar(login, senha);
		if (usuario!=null) {
			model.addAttribute("mensagem", "Bem vindo, " + usuario.getNome()+".");
			model.addAttribute("usuario", usuario);

		}
		else {
			model.addAttribute("mensagem", "Não foi possível realizar o login, tente novamente.");
		}
		
		
		return "index";
	}
		
}
