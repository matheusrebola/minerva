package minerva.dtos;

import java.time.LocalDateTime;

import minerva.entities.Questionarios;
import minerva.entities.Usuarios;

public record AvaliacoesCreateDto(
		Float nota,
		LocalDateTime dataAvaliacao,
		Usuarios usuario,
		Questionarios questionario) {

}
