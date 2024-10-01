package aplicacion.Rest.Services;

import aplicacion.Rest.Entities.Localidad;

import aplicacion.Rest.Repositories.BaseRepository;
import aplicacion.Rest.Repositories.LocalidadRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    @Autowired
    private  LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}