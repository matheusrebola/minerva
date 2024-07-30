package minerva.dtos;

import java.time.LocalDateTime;

import minerva.entities.Cursos;
import minerva.entities.Usuarios;

public record MatriculasCreateDto(
		LocalDateTime dataMatricula,
		Usuarios usuario,
		Cursos curso) {

}
