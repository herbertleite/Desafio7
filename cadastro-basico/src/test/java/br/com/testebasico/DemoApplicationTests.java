package br.com.testebasico;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.testebasico.model.User;
import br.com.testebasico.service.UserService;


@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	void Teste1() {
		List<User> usuarios = userService.listar();
		assertEquals(usuarios.size(), 2);
	}

}
