package br.edu.infnet.appestabelecimento.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appestabelecimento.clients.IEstabelecimentoClient;
import br.edu.infnet.appestabelecimento.model.domain.Estabelecimento;

@Service
public class EstabelecimentoService {
	
	@Autowired 
	private IEstabelecimentoClient estabelecimentoClient;
	
	public void incluir(Estabelecimento estabelecimento) {
		estabelecimentoClient.incluir(estabelecimento);
	}
	
	public List<Estabelecimento> obterLista() {
		return estabelecimentoClient.obterLista();
	}
	
}
