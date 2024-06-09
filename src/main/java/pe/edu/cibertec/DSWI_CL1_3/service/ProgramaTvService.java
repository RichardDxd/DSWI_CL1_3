package pe.edu.cibertec.DSWI_CL1_3.service;

import com.example.soapservice.programas.Programa;
import pe.edu.cibertec.DSWI_CL1_3.model.ProgramaTv;
import pe.edu.cibertec.DSWI_CL1_3.repository.ProgramaTvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

@Service
public class ProgramaTvService {
    @Autowired
    private ProgramaTvRepository programaTvRepository;

    public List<ProgramaTv> findAll() {
        return programaTvRepository.findAll();
    }

    public ProgramaTv findById(int id) {
        return programaTvRepository.findById(id).orElse(null);
    }

    public ProgramaTv save(ProgramaTv programaTv) {
        return programaTvRepository.save(programaTv);
    }

    public ProgramaTv update(ProgramaTv programaTv) {
        return programaTvRepository.save(programaTv);
    }

    public void deleteById(int id) {
        programaTvRepository.deleteById(id);
    }

    public List<ProgramaTv> getAllProgramasTv() {
        return programaTvRepository.findAllByUserId(id);
    }

    public ProgramaTv createProgramaTv(String titulo, String resumen, XMLGregorianCalendar fechaInicio, int idPersonaje) {
        ProgramaTv programaTv = new ProgramaTv();
        programaTv.setTitulo(titulo);
        programaTv.setResumen(resumen);
        programaTv.setFechaInicio(fechaInicio.toGregorianCalendar().getTime());
        programaTv.setIdPersonaje(idPersonaje);
        return programaTvRepository.save(programaTv);
    }

    public Programa updateProgramaTv(int id, String titulo, String resumen, XMLGregorianCalendar fechaInicio, int idPersonaje) {
        ProgramaTv programaTv = programaTvRepository.findById(id).orElse(null);
        if (programaTv != null) {
            programaTv.setTitulo(titulo);
            programaTv.setResumen(resumen);
            programaTv.setFechaInicio(fechaInicio.toGregorianCalendar().getTime());
            programaTv.setIdPersonaje(idPersonaje);
            return programaTvRepository.save(programaTv);
        }
        return null;
    }

    public void deleteProgramaTv(int id) {
        programaTvRepository.deleteById(id);
    }
}
