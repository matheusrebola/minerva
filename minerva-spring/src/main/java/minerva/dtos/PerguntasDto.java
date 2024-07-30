package minerva.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import minerva.entities.Questionarios;
import minerva.entities.TipoPergunta;

public record PerguntasDto(
		@NotNull UUID id,
		String pergunta,
		TipoPergunta tipoPergunta,
		Questionarios questionario) {

}
