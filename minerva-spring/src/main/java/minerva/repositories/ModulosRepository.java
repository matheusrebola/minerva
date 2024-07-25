package minerva.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import minerva.entities.Modulos;

@Repository
public interface ModulosRepository extends JpaRepository<Modulos, UUID> {

}
