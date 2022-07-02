package br.edu.infnet.apiestabelecimento.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.apiestabelecimento.model.domain.Funcionario;
import br.edu.infnet.apiestabelecimento.model.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	public List<Funcionario> obterLista(Integer idEstabelecimento) {
		return funcionarioRepository.obterLista(idEstabelecimento);
	}
	
	public void incluir(Funcionario funcionario) {
		funcionarioRepository.save(funcionario);
	}
	

}
