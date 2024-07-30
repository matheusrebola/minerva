package minerva.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import minerva.entities.Cursos;
import minerva.entities.TipoRelatorio;
import minerva.entities.Usuarios;

public record RelatoriosDto(
		@NotNull UUID id,
		TipoRelatorio tipoRelatorio,
		String dados,
		LocalDateTime dataGeracao,
		Usuarios usuario,
		Cursos curso) {

}
