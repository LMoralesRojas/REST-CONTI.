package aplicacion.Rest.Repositories;

import aplicacion.Rest.Entities.Autor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* Dao es un patron  que separa por completo la logica de negocio de la logica de base de datos*/
@Repository
public interface AutorRepository extends BaseRepository<Autor, Long> {

}
