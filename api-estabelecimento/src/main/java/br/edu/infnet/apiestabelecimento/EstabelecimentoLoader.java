package br.edu.infnet.apiestabelecimento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apiestabelecimento.model.service.EstabelecimentoService;

@Component
public class EstabelecimentoLoader implements ApplicationRunner{

	@Autowired
	private EstabelecimentoService estabelecimentoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
//		System.out.println("Execução do loader do Estabelecimento:");
//		
//		Estabelecimento estabelecimento = new Estabelecimento();
//		estabelecimento.setCnpj("00.673.757/0001-46");
//		estabelecimento.setEdtech(true);
//		estabelecimento.setEndereco("endereço");
//		estabelecimento.setLogin("infnet");
//		estabelecimento.setNome("Infnet");
//		estabelecimento.setSenha("123");
//		
//		try {
//			estabelecimentoService.incluir(estabelecimento);
//			
//			System.out.println("Inclusão do Estabelecimento " + estabelecimento.getNome() + 
//					" realizada com sucesso.");			
//		} catch (Exception e) {
//			System.out.println("[ERROR] Impossível realizar a inclusão do Estabelecimento");
//			System.out.println("[ESTABELECIMENTO] LOGIN = " + estabelecimento.getLogin() + 
//					", CNPJ = " + estabelecimento.getCnpj());
//			
//		}
//		
		
	}

	
}
