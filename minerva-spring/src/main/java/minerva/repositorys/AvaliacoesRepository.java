package minerva.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import minerva.entities.Avaliacoes;

@Repository
public interface AvaliacoesRepository extends JpaRepository<Avaliacoes, UUID> {

}
