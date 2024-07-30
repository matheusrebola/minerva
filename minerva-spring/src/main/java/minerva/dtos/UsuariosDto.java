package minerva.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.validation.constraints.NotNull;
import minerva.entities.TipoUsuario;

public record UsuariosDto(
		@NotNull UUID id,
		String nome,
		String email,
		String senha,
		TipoUsuario tipoUsuario,
		LocalDateTime dataCriacao) {

}
