package minerva.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Respostas(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String respostas,
		Boolean correta,
		Perguntas pergunta) {

}
