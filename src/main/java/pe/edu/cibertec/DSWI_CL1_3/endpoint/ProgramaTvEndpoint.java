package pe.edu.cibertec.DSWI_CL1_3.endpoint;

import com.example.soapservice.programas.*;
import pe.edu.cibertec.DSWI_CL1_3.model.ProgramaTv;
import pe.edu.cibertec.DSWI_CL1_3.service.ProgramaTvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


import java.util.List;

@Endpoint
public class ProgramaTvEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/soapservice/programas";

    @Autowired
    private ProgramaTvService programaTvService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getProgramaRequest")
    @ResponsePayload
    public GetProgramaResponse getProgramaTv(@RequestPayload GetProgramaRequest request) {
        GetProgramaResponse response = new GetProgramaResponse();
        response.setProgramaTv(programaTvService.getAllProgramasTv());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "createProgramaTvRequest")
    @ResponsePayload
    public CreateProgramaResponse createProgramaTv(@RequestPayload CreateProgramaRequest request) {
        CreateProgramaResponse response = new CreateProgramaResponse();
        response.setProgramaTv(programaTvService.createProgramaTv(request.getTitulo(), request.getResumen(), request.getFechaInicio(), request.getIdPersonaje()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateProgramaTvRequest")
    @ResponsePayload
    public UpdateProgramaResponse updateProgramaTv(@RequestPayload UpdateProgramaRequest request) {
        UpdateProgramaResponse response = new UpdateProgramaResponse();
        response.setPrograma(programaTvService.updateProgramaTv(request.getId(), request.getTitulo(), request.getResumen(), request.getFechaInicio(), request.getIdPersonaje()));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteProgramaTvRequest")
    @ResponsePayload
    public DeleteProgramaResponse deleteProgramaTv(@RequestPayload DeleteProgramaRequest request) {
        DeleteProgramaResponse response = new DeleteProgramaResponse();
        programaTvService.deleteProgramaTv(request.getId());
        response.setStatus("Programa eliminado exitosamente");
        return response;

    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllProgramasTvRequest")
    @ResponsePayload
    public GetAllProgramasResponse getAllProgramasTv(@RequestPayload GetAllProgramasRequest request) {
        GetAllProgramasResponse response = new GetAllProgramasResponse();
        List<ProgramaTv> programasTv = programaTvService.getAllProgramasTv();
        Programa ProgramaTv = null;
        programasTv.forEach(programaTv -> response.getProgramas().add(ProgramaTv));
        return response;
    }
}
