package minerva.dtos;

import minerva.entities.Modulos;
import minerva.entities.TipoConteudo;

public record ConteudoCreateDto(
		TipoConteudo tipoConteudo,
		String titulo,
		String conteudo,
		Modulos modulos) {

}
