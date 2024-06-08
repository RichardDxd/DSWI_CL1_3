package pe.edu.cibertec.DSWI_CL1_3.service;

import pe.edu.cibertec.DSWI_CL1_3.model.Personaje;
import pe.edu.cibertec.DSWI_CL1_3.repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonajeService {
    @Autowired
    private PersonajeRepository personajeRepository;

    public List<Personaje> findAll() {
        return personajeRepository.findAll();
    }

    public Personaje findById(int id) {
        return personajeRepository.findById(id).orElse(null);
    }

    public Personaje save(Personaje personaje) {
        return personajeRepository.save(personaje);
    }

    public Personaje update(Personaje personaje) {
        return personajeRepository.save(personaje);
    }

    public void deleteById(int id) {
        personajeRepository.deleteById(id);
    }
}
