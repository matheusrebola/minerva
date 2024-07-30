package minerva.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;

public record CursosDto(
		@NotNull UUID id,
		String titulo,
		LocalDateTime dataCriacao) {

}
