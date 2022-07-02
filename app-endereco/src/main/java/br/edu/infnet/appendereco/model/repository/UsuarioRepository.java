package br.edu.infnet.appendereco.model.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appendereco.model.domain.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
	@Query("from Usuario u where u.email = :email and u.senha = :senha")
	public Usuario autenticar(String email, String senha);
	
	public Usuario findByEmail(String email);
}
