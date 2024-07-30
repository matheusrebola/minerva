package minerva.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import minerva.entities.Cursos;
import minerva.entities.Usuarios;

public record CertificadosDto(
		@NotNull UUID id,
		LocalDateTime dataEmissao,
		UUID codigoCertificado,
		Usuarios usuario,
		Cursos curso) {

}
