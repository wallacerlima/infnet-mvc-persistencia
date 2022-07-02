package br.edu.infnet.apiestabelecimento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apiestabelecimento.model.domain.Estabelecimento;
import br.edu.infnet.apiestabelecimento.model.domain.Funcionario;
import br.edu.infnet.apiestabelecimento.model.service.FuncionarioService;
import br.edu.infnet.apiestabelecimento.model.service.UsuarioService;

@Component
public class FuncionarioLoader implements ApplicationRunner{
	
	@Autowired
	private FuncionarioService funcionarioService;
	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
//		System.out.println("Execução do loader do Funcionário:");
//		
//		Estabelecimento estabelecimento = (Estabelecimento) usuarioService.validar("infnet", "123");
//
//		String[] cpfs = {"11111111111", "99999999999", "33333333333"};
//		
//		for(String cpf : cpfs) {
//			Funcionario funcionario1 = new Funcionario();
//			funcionario1.setCpf(cpf);
//			funcionario1.setEmail("funcioanrio1@email.com");
//			funcionario1.setTelefone("(99) 99999-9999");
//			funcionario1.setNome("Funcionário1");
//			funcionario1.setLogin("f"+cpf);
//			funcionario1.setSenha("123");
//			funcionario1.setEstabelecimento(estabelecimento);
//			
//			try {
//				funcionarioService.incluir(funcionario1);
//				System.out.println("Inclusão do Funcionário " + funcionario1.getNome() + 
//						" realizada com sucesso.");			
//			} catch (Exception e) {
//				System.out.println("[ERROR] Impossível realizar a inclusão do Funcionário");
//				System.out.println("[FUNCIONARIO] LOGIN = " + funcionario1.getLogin() + 
//						", CNPJ = " + funcionario1.getCpf());
//			}
//		}
//		
//		funcionarioService.obterLista(estabelecimento.getId()).stream()
//			.forEach(f -> System.out.println(" - "+ f.getNome() + " - "+ f.getCpf()));
//		
//		
//		
//		
		
	}

}
