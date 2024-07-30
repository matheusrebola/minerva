package minerva.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

public record CursosDto(
		UUID id,
		String titulo,
		LocalDateTime dataCriacao) {

}
