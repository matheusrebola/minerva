package minerva.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import minerva.entities.Perguntas;

@Repository
public interface PerguntasRepository extends JpaRepository<Perguntas, UUID> {

}
