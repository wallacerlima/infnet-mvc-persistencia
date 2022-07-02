package br.edu.infnet.apiestabelecimento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.apiestabelecimento.model.domain.Usuario;
import br.edu.infnet.apiestabelecimento.model.service.UsuarioService;

@Component
public class UsuarioLoader implements ApplicationRunner{
	
	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
//		System.out.println("Execução do loader do Usuario:");
//		Usuario usuario = usuarioService.validar("f99999999999", "123");
//		try {
//			usuarioService.excluir(usuario.getId());
//			
//			System.out.println("Exclusão do Usuário " + usuario.getNome() + " realizada com sucesso.");
//		} catch (Exception e) {
//			System.out.println("[ERROR] Impossível excluir o usuário "+usuario.getNome());
//		}
					

		
	}

}
