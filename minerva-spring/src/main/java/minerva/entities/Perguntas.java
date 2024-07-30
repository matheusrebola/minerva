package minerva.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Perguntas(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String pergunta,
		TipoPergunta tipoPergunta,
		Questionarios questionario) {

}
