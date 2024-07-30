package minerva.dtos;

import java.util.UUID;

import minerva.entities.Perguntas;

public record RespostasDto(
		UUID id,
		String respostas,
		Boolean correta,
		Perguntas pergunta) {

}
