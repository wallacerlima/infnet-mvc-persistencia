package br.edu.infnet.appvotacao.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.appvotacao.model.domain.Eleicao;

@FeignClient(url = "localhost:8080/api/eleicao", name = "eleicaoClient")
public interface IEleicaoClient {
	
	@PostMapping(value="/incluir")
	public void incluir(@RequestBody Eleicao eleicao);
	
	@GetMapping(value="/{id}/obter")
	public Eleicao obterPorId(@PathVariable int id);
	
	@GetMapping(value="/listar")
	public List<Eleicao> obterLista();
	
	@DeleteMapping(value="/{id}/excluir")
	public void excluir(@PathVariable Integer id);

}
