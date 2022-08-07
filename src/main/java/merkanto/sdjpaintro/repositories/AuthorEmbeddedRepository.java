package merkanto.sdjpaintro.repositories;

import merkanto.sdjpaintro.domain.composite.AuthorEmbedded;
import merkanto.sdjpaintro.domain.composite.NameId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorEmbeddedRepository extends JpaRepository<AuthorEmbedded, NameId> {
}
