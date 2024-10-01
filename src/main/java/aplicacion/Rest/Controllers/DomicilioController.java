package aplicacion.Rest.Controllers;

import aplicacion.Rest.Entities.Domicilio;
import aplicacion.Rest.Services.DomicilioServiceImpl;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilio")
public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl> {

}
