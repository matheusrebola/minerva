package minerva.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import minerva.entities.Questionarios;

@Repository
public interface QuestionariosRepository extends JpaRepository<Questionarios, UUID> {

}
