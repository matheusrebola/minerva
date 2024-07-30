package minerva.dtos;

import minerva.entities.Cursos;
import minerva.entities.Usuarios;

public record CursosUsuarioDto(
		Cursos curso,
		Usuarios usuario) {

}
