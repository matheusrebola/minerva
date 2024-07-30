package minerva.dtos;

import java.util.UUID;

import minerva.entities.Conteudos;

public record QuestionariosDto(
		UUID id,
		String titulo,
		String descricao,
		Conteudos conteudo) {

}
