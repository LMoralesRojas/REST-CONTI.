package aplicacion.Rest.Services;

import aplicacion.Rest.Entities.Base;
import aplicacion.Rest.Entities.Persona;
import aplicacion.Rest.Repositories.BaseRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.io.Serializable;
import java.util.List;

public interface BaseService <E extends Base, ID extends Serializable> {

    /* Trae listas */
    public List<E> findAll() throws Exception;
    /* trea entidades segun su id*/
    public E findById(ID id) throws Exception;
    /* crea una nueva entidad*/
    public E save(E entity) throws Exception;
    /*tiene lo parametros de manera actualizada*/
    public E update(ID id, E entity) throws Exception;
    /*elimina un registro de la base de datos*/
    public boolean delete(ID id) throws Exception;
    //Metedo para obtener una sublista
    public Page<E> findAll(Pageable pageable) throws Exception;

}
