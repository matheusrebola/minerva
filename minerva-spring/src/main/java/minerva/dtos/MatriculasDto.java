package minerva.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import minerva.entities.Cursos;
import minerva.entities.Usuarios;

public record MatriculasDto(
		@NotNull UUID id,
		LocalDateTime dataMatricula,
		Usuarios usuario,
		Cursos curso) {

}
