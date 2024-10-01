package aplicacion.Rest.Services;

import aplicacion.Rest.Entities.Autor;
import aplicacion.Rest.Repositories.AutorRepository;
import aplicacion.Rest.Repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements  AutorService{

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }

}