package minerva.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Entity;
import minerva.entities.Matriculas;

@Entity
public interface MatriculasRepository extends JpaRepository<Matriculas, UUID> {

}
