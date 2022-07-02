package br.edu.infnet.appvotacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appvotacao.model.domain.Candidato;
import br.edu.infnet.appvotacao.model.service.CandidatoService;

@Component
public class CandidatoLoader implements ApplicationRunner {

	@Autowired
	private CandidatoService candidatoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Candidato candidato = new Candidato();
		candidato.setNome("Candidato Elberth");
		candidato.setNumero(12345);
		
		try {
			candidatoService.incluir(candidato);
			System.out.println("[SUCESSO] Inclusão realizada");
		} catch (Exception e) {
			System.out.println("[ERRO]" + e.getMessage());
		}
		
		
		
	}

}
