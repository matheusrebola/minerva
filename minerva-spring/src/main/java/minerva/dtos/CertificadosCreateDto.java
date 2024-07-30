package minerva.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import minerva.entities.Cursos;
import minerva.entities.Usuarios;

public record CertificadosCreateDto(
		LocalDateTime dataEmissao,
		UUID codigoCertificado,
		Usuarios usuario,
		Cursos curso) {

}
