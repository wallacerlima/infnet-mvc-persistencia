package br.edu.infnet.appvotacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppVotacaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppVotacaoApplication.class, args);
	}

}
