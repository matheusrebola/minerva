package minerva.dtos;

import java.util.UUID;

import minerva.entities.Questionarios;
import minerva.entities.TipoPergunta;

public record PerguntasDto(
		UUID id,
		String pergunta,
		TipoPergunta tipoPergunta,
		Questionarios questionario) {

}
