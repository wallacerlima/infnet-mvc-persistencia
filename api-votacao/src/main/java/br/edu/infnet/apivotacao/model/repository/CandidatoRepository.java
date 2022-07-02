package br.edu.infnet.apivotacao.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.apivotacao.model.domain.Candidato;

@Repository
public interface CandidatoRepository extends CrudRepository<Candidato, Integer>{
	
//	@Query("from Candidato c where c.eleicao.id = :ideleicao")
//	List<Candidato> findAll(int idEleicao);

}
