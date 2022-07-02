package br.edu.infnet.appendereco.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appendereco.clients.IbgeClient;
import br.edu.infnet.appendereco.model.domain.Estado;
import br.edu.infnet.appendereco.model.domain.Municipio;

@Service
public class IbgeService {
	
	@Autowired
	private IbgeClient ibgeClient;
	
	public List<Estado> obterEstados() {
		return ibgeClient.obterEstados();
	}
	
	public List<Municipio> obterMunicipios(String uf) {
		return ibgeClient.obterMunicipios(uf);
	}

}
