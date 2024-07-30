package minerva.dtos;

import minerva.entities.Cursos;

public record ModulosCreateDto(
		String titulo,
		String descricao,
		Integer ordem,
		Cursos curso) {

}
