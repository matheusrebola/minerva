package minerva.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Progresso(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		StatusProgresso statusProgresso,
		LocalDateTime dataConclusao,
		Usuarios usuario,
		Conteudos conteudo) {

}
