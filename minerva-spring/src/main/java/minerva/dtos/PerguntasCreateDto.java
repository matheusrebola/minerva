package minerva.dtos;

import minerva.entities.Questionarios;
import minerva.entities.TipoPergunta;

public record PerguntasCreateDto(
		String pergunta,
		TipoPergunta tipoPergunta,
		Questionarios questionario) {

}
