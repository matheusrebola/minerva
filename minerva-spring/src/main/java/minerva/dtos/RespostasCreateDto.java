package minerva.dtos;

import minerva.entities.Perguntas;

public record RespostasCreateDto(
		String respostas,
		Boolean correta,
		Perguntas pergunta) {

}
