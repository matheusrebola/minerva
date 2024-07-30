package minerva.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import minerva.entities.Conteudos;
import minerva.entities.StatusProgresso;
import minerva.entities.Usuarios;

public record ProgressoDto(
		UUID id,
		StatusProgresso statusProgresso,
		LocalDateTime dataConclusao,
		Usuarios usuario,
		Conteudos conteudo) {

}
