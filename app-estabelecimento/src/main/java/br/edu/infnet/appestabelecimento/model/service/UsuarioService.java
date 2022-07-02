package br.edu.infnet.appestabelecimento.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appestabelecimento.clients.IUsuarioClient;
import br.edu.infnet.appestabelecimento.model.domain.Usuario;

@Service
public class UsuarioService {
	
	@Autowired 
	private IUsuarioClient usuarioClient;
	
	public Usuario validar (String login, String senha) {
		return usuarioClient.validar(login, senha);
	}
	
	public void excluir(Integer id) {
		usuarioClient.excluir(id);
	}
	
	public List<Usuario> obterLista() {
		return usuarioClient.obterLista();
	}
	
}
