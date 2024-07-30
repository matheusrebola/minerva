package minerva.dtos;

import java.time.LocalDateTime;

public record CursosCreateDto(
		String titulo,
		LocalDateTime dataCriacao) {

}
