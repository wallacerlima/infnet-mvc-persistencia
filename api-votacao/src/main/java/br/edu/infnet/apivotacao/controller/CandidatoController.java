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

import br.edu.infnet.apivotacao.model.domain.Candidato;
import br.edu.infnet.apivotacao.model.service.CandidatoService;
import br.edu.infnet.apivotacao.model.service.EleicaoService;

@RestController
@RequestMapping("/api/candidato")
public class CandidatoController {
	
	@Autowired
	CandidatoService candidatoService;
	
	@Autowired
	EleicaoService eleicaoService;
	
	@PostMapping(value="/incluir")
	public void incluir(@RequestBody Candidato candidato) {
		candidatoService.incluir(candidato);
	}
	
	@GetMapping(value="/listar")
	public List<Candidato> obterLista() {
		return candidatoService.obterLista();
	}
	
	@GetMapping(value="/{idEleicao}/listar")
	public List<Candidato> obterPorEleicao(@PathVariable int idEleicao) {		
		return candidatoService.obterPorEleicao(eleicaoService.obterPorId(idEleicao));
	}
	
	@DeleteMapping(value="/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		candidatoService.excluir(id);
	}

}
