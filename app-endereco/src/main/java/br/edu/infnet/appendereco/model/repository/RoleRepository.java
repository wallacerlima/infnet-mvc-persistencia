package br.edu.infnet.appendereco.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appendereco.model.domain.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer>{
	
	public Role findByNome(String nome);

}
