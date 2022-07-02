package br.edu.infnet.appendereco.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appendereco.model.domain.Usuario;
import br.edu.infnet.appendereco.model.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public void excluir(Usuario usuario) {
		usuarioRepository.deleteById(usuario.getId());
	}
	
	public Usuario autenticar(String email, String senha) {
		
		Usuario usuarioRetornado = usuarioRepository.findByEmail(email);
		
		if(usuarioRetornado != null && usuarioRetornado.getSenha().equals(senha)){
			return usuarioRetornado;
		}
		
		return null;
	}
}
