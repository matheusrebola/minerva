package minerva.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import minerva.entities.Cursos;

@Repository
public interface CursosRepository extends JpaRepository<Cursos, UUID> {

}
