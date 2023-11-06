package br.com.fiap.cp2.Controllers;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import br.com.fiap.cp2.Domain.task.Task;
import br.com.fiap.cp2.Domain.task.TaskRequestDTO;
import br.com.fiap.cp2.Domain.task.TaskResponseDTO;
import br.com.fiap.cp2.repositories.TaskRepository;

import java.util.List;

@RestController()
@RequestMapping("Task")
public class TaskController {

  @Autowired
  TaskRepository repository;

  @PostMapping
  public ResponseEntity<TaskRequestDTO> postTask(@RequestBody @Valid TaskRequestDTO body) {
    Task newTask = new Task(body);

    this.repository.save(newTask);
    return ResponseEntity.ok().build();
  }

  @GetMapping
  public ResponseEntity<List<TaskResponseDTO>> getAllTasks() {
    List<TaskResponseDTO> taskList = this.repository.findAll().stream().map(TaskResponseDTO::new).toList();

    return ResponseEntity.ok(taskList);
  }
}

// Modificar para o TASK
