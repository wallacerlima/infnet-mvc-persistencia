package br.edu.infnet.appestabelecimento.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.appestabelecimento.model.domain.Estabelecimento;

@FeignClient(url = "localhost:8080/api/estabelecimento", name = "estabelecimentoClient")
public interface IEstabelecimentoClient {
	
	@PostMapping(value="/incluir")
	public void incluir(@RequestBody Estabelecimento estabelecimento);
	
	@GetMapping(value="listar")
	public List<Estabelecimento> obterLista();

}
