package minerva.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import minerva.entities.Conteudos;
import minerva.entities.StatusProgresso;
import minerva.entities.Usuarios;

public record ProgressoDto(
		@NotNull UUID id,
		StatusProgresso statusProgresso,
		LocalDateTime dataConclusao,
		Usuarios usuario,
		Conteudos conteudo) {

}
