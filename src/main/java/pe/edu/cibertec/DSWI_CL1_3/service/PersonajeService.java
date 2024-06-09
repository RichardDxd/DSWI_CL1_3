package pe.edu.cibertec.DSWI_CL1_3.service;

import pe.edu.cibertec.DSWI_CL1_3.model.Personaje;
import pe.edu.cibertec.DSWI_CL1_3.repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonajeService {

    @Autowired
    private PersonajeRepository personajeRepository;

    public com.example.soapservice.personajes.Personaje getPersonajeById(int id) {
        Personaje personaje = personajeRepository.findById(id).orElse(null);
        if (personaje != null) {
            return mapToSoapPersonaje(personaje);
        }
        return null;
    }

    public com.example.soapservice.personajes.Personaje createPersonaje(String nomPersonaje, String apePersonaje, XMLGregorianCalendar fechNacPersonaje) {
        Personaje personaje = new Personaje();
        personaje.setNomPersonaje(nomPersonaje);
        personaje.setApePersonaje(apePersonaje);
        // Convertir XMLGregorianCalendar a java.util.Date o LocalDate según la implementación de Personaje
        // personaje.setFechNacPersonaje(...);
        Personaje savedPersonaje = personajeRepository.save(personaje);
        return mapToSoapPersonaje(savedPersonaje);
    }

    public com.example.soapservice.personajes.Personaje updatePersonaje(int id, String nomPersonaje, String apePersonaje, XMLGregorianCalendar fechNacPersonaje) {
        Personaje personaje = personajeRepository.findById(id).orElse(null);
        if (personaje != null) {
            personaje.setNomPersonaje(nomPersonaje);
            personaje.setApePersonaje(apePersonaje);
            // Convertir XMLGregorianCalendar a java.util.Date o LocalDate según la implementación de Personaje
            // personaje.setFechNacPersonaje(...);
            Personaje updatedPersonaje = personajeRepository.save(personaje);
            return mapToSoapPersonaje(updatedPersonaje);
        }
        return null;
    }

    public List<com.example.soapservice.personajes.Personaje> getAllPersonajes() {
        List<Personaje> allPersonajes = personajeRepository.findAll();
        return allPersonajes.stream()
                .map(this::mapToSoapPersonaje)
                .collect(Collectors.toList());
    }

    public void deletePersonaje(int id) {
        personajeRepository.deleteById(id);
    }

    private com.example.soapservice.personajes.Personaje mapToSoapPersonaje(Personaje personaje) {
        com.example.soapservice.personajes.Personaje soapPersonaje = new com.example.soapservice.personajes.Personaje();
        // No hay setId en el objeto SOAP generado, por lo que se omite esta línea
        soapPersonaje.setNomPersonaje(personaje.getNomPersonaje());
        soapPersonaje.setApePersonaje(personaje.getApePersonaje());
        // Convertir java.util.Date o LocalDate a XMLGregorianCalendar según la implementación de Personaje
        // soapPersonaje.setFechNacPersonaje(...);
        return soapPersonaje;
    }
}

