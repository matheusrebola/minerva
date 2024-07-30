package minerva.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Questionarios(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String titulo,
		String descricao,
		Conteudos conteudo) {

}
