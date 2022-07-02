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

import br.edu.infnet.apivotacao.model.domain.Eleitor;
import br.edu.infnet.apivotacao.model.service.EleitorService;

@RestController
@RequestMapping("/api/eleitor")
public class EleitorController {
	
	@Autowired 
	EleitorService eleitorService;
	
	@PostMapping(value="/incluir")
	public void incluir(@RequestBody Eleitor eleitor) {
		eleitorService.incluir(eleitor);
	}
	
	@GetMapping(value="/listar")
	public List<Eleitor> obterLista() {
		return eleitorService.obterLista();
	}
	
	@DeleteMapping(value="/{id}/excluir")
	public void excluir(@PathVariable Integer id) {
		eleitorService.excluir(id);
	}

}
