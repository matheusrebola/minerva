package minerva.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import minerva.entities.Modulos;
import minerva.entities.TipoConteudo;

public record ConteudosDto(
		@NotNull UUID id,
		TipoConteudo tipoConteudo,
		String titulo,
		String conteudo,
		Modulos modulos) {

}
