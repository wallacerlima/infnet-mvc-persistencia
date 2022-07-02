package br.edu.infnet.apivotacao.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apivotacao.model.domain.Eleicao;
import br.edu.infnet.apivotacao.model.repository.EleicaoRepository;

@Service
public class EleicaoService {
	
	@Autowired EleicaoRepository eleicaoRepository;
	
	public void incluir(Eleicao eleicao) {
		eleicaoRepository.save(eleicao);
	}
	
	public Eleicao obterPorId(int id) {
		return eleicaoRepository.findById(id).orElseGet(null);
	}
	
	public List<Eleicao> obterLista() {
		return (List<Eleicao>) eleicaoRepository.findAll();
	}
	
	public void excluir(Integer id) {
		eleicaoRepository.deleteById(id);
	}

}
