package br.com.fiap.cp2.Domain.task;

import java.util.Calendar;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "task")
@Entity(name = "task")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Task {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id", updatable = false, nullable = false)
  private String id;

  @Column(name = "title", nullable = false, length = 50)
  private String title;

  @Column(name = "description", nullable = false, length = 100)
  private String description;

  @Column(name = "status", nullable = false)
  private Boolean status;

  @Column(name = "dueDate", nullable = false)
  private Calendar dueDate;

  public Task(TaskRequestDTO data) {
    this.title = data.title();
    this.description = data.description();
    this.status = data.status();
    this.dueDate = data.dueDate();
  }
}
