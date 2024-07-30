package minerva.dtos;

import minerva.entities.Conteudos;

public record QuestionariosCreateDto(
		String titulo,
		String descricao,
		Conteudos conteudo) {

}
