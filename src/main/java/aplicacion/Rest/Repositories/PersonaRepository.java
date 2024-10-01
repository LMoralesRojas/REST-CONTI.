package aplicacion.Rest.Repositories;

import aplicacion.Rest.Entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/* Dao es un patron  que separa por completo la logica de negocio de la logica de base de datos*/
@Repository
public interface PersonaRepository extends BaseRepository<Persona, Long> {
    //Debido a que son nomenclaturas muy largas se prefieres usar la query como jpql
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);
    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);

    //boolean existsByDni(int dni); si es que existe una persona con ese dni en particular
    //Consulta jpql
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")// el ? es para referirse al tipo de bsuqueda numerico lo que ba en el %% el valor numerico indica el valor del atributo declarado abajo, mientras mas declaremos mas crecera este numero.
    List<Persona> search(@Param("filtro") String filtro);

    //consulta SQL
    @Query(
            value = "SELECT  * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            nativeQuery = true,
            countQuery = "SELECT count(*) FROM persona "
    )
    List<Persona> searchNativo(@Param("filtro") String filtro);

    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")// el ? es para referirse al tipo de bsuqueda numerico lo que ba en el %% el valor numerico indica el valor del atributo declarado abajo, mientras mas declaremos mas crecera este numero.
    Page<Persona> search(@Param("filtro") String filtro, Pageable pageable);

    //consulta SQL
    @Query(
            value = "SELECT  * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro%",
            nativeQuery = true
    )
    Page<Persona> searchNativo(@Param("filtro") String filtro, Pageable pageable);
}
