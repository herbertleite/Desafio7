package br.com.testebasico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.testebasico.model.User;
import br.com.testebasico.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	
	public User salvar(User u) {
		return userRepository.save(u);
	}
	
	public User atualizar(User u) {
		return userRepository.save(u);
	}
	
	public List<User> listar() {
		return userRepository.findAll();
	}

}
