package ad.spring.practicaFinal.repository;

import ad.spring.practicaFinal.domain.Videojuegos;
import org.springframework.data.repository.CrudRepository;

public interface VideojuegosRepository extends CrudRepository<Videojuegos, Integer> {
}
