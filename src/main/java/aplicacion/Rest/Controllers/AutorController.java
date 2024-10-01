package aplicacion.Rest.Controllers;

import aplicacion.Rest.Entities.Autor;

import aplicacion.Rest.Services.AutorServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autor")
public class AutorController extends BaseControllerImpl<Autor,AutorServiceImpl>{

}
