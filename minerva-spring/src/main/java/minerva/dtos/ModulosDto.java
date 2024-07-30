package minerva.dtos;

import java.util.UUID;

import minerva.entities.Cursos;

public record ModulosDto(
		UUID id,
		String titulo,
		String descricao,
		Integer ordem,
		Cursos curso) {

}
