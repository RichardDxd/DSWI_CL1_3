package pe.edu.cibertec.DSWI_CL1_3.repository;

import pe.edu.cibertec.DSWI_CL1_3.model.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends JpaRepository<Personaje, Integer>{
}
