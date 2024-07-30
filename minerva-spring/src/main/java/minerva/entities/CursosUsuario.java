package minerva.entities;

import jakarta.persistence.Entity;

@Entity
public record CursosUsuario(
		Cursos curso,
		Usuarios usuario) {

}
