package br.com.fiap.cp2.Domain.task;

import java.util.Calendar;

public record TaskResponseDTO(String id, String title, String description, Boolean status, Calendar dueDate) {
  public TaskResponseDTO(Task task) {
    this(task.getId(), task.getTitle(), task.getDescription(), task.getStatus(), task.getDueDate());
  }
}
