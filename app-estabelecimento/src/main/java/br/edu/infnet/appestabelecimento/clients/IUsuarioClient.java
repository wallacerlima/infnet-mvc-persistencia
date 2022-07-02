package br.edu.infnet.appestabelecimento.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.appestabelecimento.model.domain.Usuario;

@FeignClient(url = "localhost:8080/api/usuario", name = "usuarioClient")
public interface IUsuarioClient {
	
	@PostMapping(value="/validar")
	public Usuario validar (@RequestParam String login, @RequestParam String senha);
	
	@DeleteMapping(value="/{id}/excluir")
	public void excluir(@PathVariable Integer id);
	
	@GetMapping(value="/listar")
	public List<Usuario> obterLista();

}
