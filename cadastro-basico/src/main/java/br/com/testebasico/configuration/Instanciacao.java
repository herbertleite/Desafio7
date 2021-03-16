package br.com.testebasico.configuration;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.testebasico.model.User;
import br.com.testebasico.repository.UserRepository;

@Configuration
public class Instanciacao implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		userRepository.deleteAll();

		User u = new User("Herbert", "1996-08-15", "euzinho.jpg");
		User u2 = new User("Pedrinho", "1998-05-13", "pedro.jpg");

		userRepository.saveAll(Arrays.asList(u,u2));
		

	}

}
