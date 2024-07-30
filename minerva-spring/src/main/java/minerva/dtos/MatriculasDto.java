package minerva.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import minerva.entities.Cursos;
import minerva.entities.Usuarios;

public record MatriculasDto(
		UUID id,
		LocalDateTime dataMatricula,
		Usuarios usuario,
		Cursos curso) {

}
