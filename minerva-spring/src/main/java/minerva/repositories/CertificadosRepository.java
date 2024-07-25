package minerva.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import minerva.entities.Certificados;

@Repository
public interface CertificadosRepository extends JpaRepository<Certificados, UUID> {

}
