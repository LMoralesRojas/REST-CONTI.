package aplicacion.Rest.Services;

import aplicacion.Rest.Entities.Libro;
import aplicacion.Rest.Repositories.BaseRepository;
import aplicacion.Rest.Repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService{

    @Autowired
    private  LibroRepository libroRepository;

    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }
}