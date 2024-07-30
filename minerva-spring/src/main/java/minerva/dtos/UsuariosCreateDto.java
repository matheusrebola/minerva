package minerva.dtos;

import java.time.LocalDateTime;

import minerva.entities.TipoUsuario;

public record UsuariosCreateDto(
		String nome,
		String email,
		String senha,
		TipoUsuario tipoUsuario,
		LocalDateTime dataCriacao) {

}
