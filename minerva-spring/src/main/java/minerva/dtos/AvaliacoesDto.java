package minerva.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import minerva.entities.Questionarios;
import minerva.entities.Usuarios;

public record AvaliacoesDto(
		@NotNull UUID id,
		Float nota,
		LocalDateTime dataAvaliacao,
		Usuarios usuario,
		Questionarios questionario) {

}
