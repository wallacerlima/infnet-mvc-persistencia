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

import br.edu.infnet.apivotacao.model.domain.Voto;
import br.edu.infnet.apivotacao.model.service.VotoService;

@RestController
@RequestMapping("/api/voto")
public class VotoController {
	
	@Autowired 
	VotoService votoService;
	
	@PostMapping(value="/incluir")
	public void incluir(@RequestBody Voto voto) {
		votoService.incluir(voto);
	}
	
	@GetMapping(value="/listar")
	public List<Voto> obterLista() {
		return votoService.obterLista();
	}
	
	@DeleteMapping(value="/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		votoService.excluir(id);
	}

}
