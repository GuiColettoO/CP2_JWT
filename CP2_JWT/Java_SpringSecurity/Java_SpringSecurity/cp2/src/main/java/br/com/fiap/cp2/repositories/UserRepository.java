package br.com.fiap.cp2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import br.com.fiap.cp2.Domain.user.User;

public interface UserRepository extends JpaRepository<User, String> {
  UserDetails findByLogin(String login);
}
