package br.com.fiap.cp2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.fiap.cp2.Domain.task.Task;

public interface TaskRepository extends JpaRepository<Task, String> {

}
