package minerva.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import minerva.entities.Usuarios;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, UUID> {

}
