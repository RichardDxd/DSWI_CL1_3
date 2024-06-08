package pe.edu.cibertec.DSWI_CL1_3.service;

import pe.edu.cibertec.DSWI_CL1_3.model.ProgramaTv;
import pe.edu.cibertec.DSWI_CL1_3.repository.ProgramaTvRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
