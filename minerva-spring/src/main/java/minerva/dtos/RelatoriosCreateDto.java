package minerva.dtos;

import java.time.LocalDateTime;

import minerva.entities.Cursos;
import minerva.entities.TipoRelatorio;
import minerva.entities.Usuarios;

public record RelatoriosCreateDto(
		TipoRelatorio tipoRelatorio,
		String dados,
		LocalDateTime dataGeracao,
		Usuarios usuario,
		Cursos curso) {

}
