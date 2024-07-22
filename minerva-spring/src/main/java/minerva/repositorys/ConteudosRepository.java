package minerva.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import minerva.entities.Conteudos;

@Repository
public interface ConteudosRepository extends JpaRepository<Conteudos, UUID> {

}
