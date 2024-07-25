package minerva.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import minerva.entities.Respostas;

@Repository
public interface RespostasRepository extends JpaRepository<Respostas, UUID> {

}
