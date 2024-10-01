package aplicacion.Rest.Services;

import aplicacion.Rest.Entities.Domicilio;

import aplicacion.Rest.Repositories.BaseRepository;
import aplicacion.Rest.Repositories.DomicilioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio, Long> implements DomicilioService{

    @Autowired
    private  DomicilioRepository domicilioRepository;

    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }
}