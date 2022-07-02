package br.edu.infnet.appvotacao.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.appvotacao.model.domain.Candidato;

@FeignClient(url = "localhost:8080/api/candidato", name = "candidatoClient")
public interface ICandidatoClient {
	
	@PostMapping(value="/incluir")
	public void incluir(@RequestBody Candidato candidato);
	
	@GetMapping(value="/listar")
	public List<Candidato> obterLista();
	
	@GetMapping(value="/{idEleicao}/listar")
	public List<Candidato> obterPorEleicao(@PathVariable int idEleicao);
	
	@DeleteMapping(value="/{id}/excluir")
	public void excluir(@PathVariable Integer id);

}
