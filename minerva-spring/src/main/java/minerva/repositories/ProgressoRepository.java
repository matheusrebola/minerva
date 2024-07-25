package minerva.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import minerva.entities.Progresso;

@Repository
public interface ProgressoRepository extends JpaRepository<Progresso, UUID> {

}
