package br.edu.infnet.apivotacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.apivotacao.model.domain.Eleicao;
import br.edu.infnet.apivotacao.model.service.EleicaoService;

@RestController
@RequestMapping("/api/eleicao")
public class EleicaoController {
	
	@Autowired
	EleicaoService eleicaoService;
	
	@PostMapping(value="/incluir")
	public void incluir(@RequestBody Eleicao eleicao) {
		eleicaoService.incluir(eleicao);
	}
	
	@GetMapping(value="/{id}/obter")
	public Eleicao obterPorId(@PathVariable int id) {
		return eleicaoService.obterPorId(id);
	}
	
	@GetMapping(value="/listar")
	public List<Eleicao> obterLista() {
		return eleicaoService.obterLista();
	}
	
	@DeleteMapping(value="/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		eleicaoService.excluir(id);
	}

}
