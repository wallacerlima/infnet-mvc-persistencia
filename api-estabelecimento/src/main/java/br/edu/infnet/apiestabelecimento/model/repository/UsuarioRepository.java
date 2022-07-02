package br.edu.infnet.apiestabelecimento.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apiestabelecimento.model.domain.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{
	
	@Query("from Usuario u where u.login = :login and u.senha = :senha")
	public Usuario validar (String login, String senha);
	
}
