package br.com.testebasico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.testebasico.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
