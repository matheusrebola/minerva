package minerva.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import minerva.entities.Perguntas;

public record RespostasDto(
		@NotNull UUID id,
		String respostas,
		Boolean correta,
		Perguntas pergunta) {

}
