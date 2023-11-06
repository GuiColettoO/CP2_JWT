package br.com.fiap.cp2.Domain.task;

import java.util.Calendar;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record TaskRequestDTO(
        @NotBlank String title,
        @NotBlank String description,
        @NotNull Boolean status,
        @NotNull Calendar dueDate) {
}
