package minerva.dtos;

import java.time.LocalDateTime;

import minerva.entities.Conteudos;
import minerva.entities.StatusProgresso;
import minerva.entities.Usuarios;

public record ProgressoCreateDto(
		StatusProgresso statusProgresso,
		LocalDateTime dataConclusao,
		Usuarios usuario,
		Conteudos conteudo) {

}
