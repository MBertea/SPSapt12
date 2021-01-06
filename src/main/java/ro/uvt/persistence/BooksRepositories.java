package ro.uvt.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.models.Carte;

@Repository
public interface BooksRepositories extends JpaRepository<Carte, Integer> {
}
