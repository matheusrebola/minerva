package minerva.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import minerva.entities.Cursos;

public record ModulosDto(
		@NotNull UUID id,
		String titulo,
		String descricao,
		Integer ordem,
		Cursos curso) {

}
