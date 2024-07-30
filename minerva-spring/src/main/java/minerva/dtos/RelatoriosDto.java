package minerva.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import minerva.entities.Cursos;
import minerva.entities.TipoRelatorio;
import minerva.entities.Usuarios;

public record RelatoriosDto(
		UUID id,
		TipoRelatorio tipoRelatorio,
		String dados,
		LocalDateTime dataGeracao,
		Usuarios usuario,
		Cursos curso) {

}
