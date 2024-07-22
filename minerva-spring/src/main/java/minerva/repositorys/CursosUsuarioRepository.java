package minerva.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import minerva.entities.CursosUsuario;

@Repository
public interface CursosUsuarioRepository extends JpaRepository<CursosUsuario, UUID> {

}
