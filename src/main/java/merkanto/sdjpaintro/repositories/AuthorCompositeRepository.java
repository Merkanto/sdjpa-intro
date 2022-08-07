package merkanto.sdjpaintro.repositories;

import merkanto.sdjpaintro.domain.composite.AuthorComposite;
import merkanto.sdjpaintro.domain.composite.NameId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorCompositeRepository extends JpaRepository<AuthorComposite, NameId> {
}
