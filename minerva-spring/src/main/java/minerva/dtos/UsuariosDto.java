package minerva.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import minerva.entities.TipoUsuario;

public record UsuariosDto(
		UUID id,
		String nome,
		String email,
		String senha,
		TipoUsuario tipoUsuario,
		LocalDateTime dataCriacao) {

}
