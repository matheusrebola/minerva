package minerva.dtos;

import java.util.UUID;

import minerva.entities.Modulos;
import minerva.entities.TipoConteudo;

public record ConteudosDto(
		UUID id,
		TipoConteudo tipoConteudo,
		String titulo,
		String conteudo,
		Modulos modulos) {

}
