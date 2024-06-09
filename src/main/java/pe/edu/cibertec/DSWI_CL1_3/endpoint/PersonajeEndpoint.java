package pe.edu.cibertec.DSWI_CL1_3.endpoint;

import com.example.soapservice.personajes.*;
import pe.edu.cibertec.DSWI_CL1_3.service.PersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;

@Endpoint
public class PersonajeEndpoint {

    private static final String NAMESPACE_URI = "http://cibertec.edu.pe/DSWI_CL1_3/soap";

    @Autowired
    private PersonajeService personajeService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPersonajeRequest")
    @ResponsePayload
    public GetPersonajeResponse getPersonaje(@RequestPayload GetPersonajeRequest request) {
        GetPersonajeResponse response = new GetPersonajeResponse();
        response.setPersonaje(personajeService.getPersonajeById(request.getId()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createPersonajeRequest")
    @ResponsePayload
    public CreatePersonajeResponse createPersonaje(@RequestPayload CreatePersonajeRequest request) {
        CreatePersonajeResponse response = new CreatePersonajeResponse();
        response.setPersonaje(personajeService.createPersonaje(request.getNomPersonaje(), request.getApePersonaje(), request.getFechNacPersonaje()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updatePersonajeRequest")
    @ResponsePayload
    public UpdatePersonajeResponse updatePersonaje(@RequestPayload UpdatePersonajeRequest request) {
        UpdatePersonajeResponse response = new UpdatePersonajeResponse();
        response.setPersonaje(personajeService.updatePersonaje(request.getId(), request.getNomPersonaje(), request.getApePersonaje(), request.getFechNacPersonaje()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deletePersonajeRequest")
    @ResponsePayload
    public DeletePersonajeResponse deletePersonaje(@RequestPayload DeletePersonajeRequest request) {
        DeletePersonajeResponse response = new DeletePersonajeResponse();
        personajeService.deletePersonaje(request.getId());
        response.setStatus("Personaje eliminado exitosamente");
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllPersonajesRequest")
    @ResponsePayload
    public GetAllPersonajesResponse getAllPersonajes(@RequestPayload GetAllPersonajesRequest request) {
        GetAllPersonajesResponse response = new GetAllPersonajesResponse();
        List<Personaje> personajes = personajeService.getAllPersonajes();
        personajes.forEach(response.getPersonajes()::add);
        return response;
    }
}
