package minerva.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import minerva.entities.Conteudos;

public record QuestionariosDto(
		@NotNull UUID id,
		String titulo,
		String descricao,
		Conteudos conteudo) {

}
