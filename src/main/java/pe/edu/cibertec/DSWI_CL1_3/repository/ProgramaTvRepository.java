package pe.edu.cibertec.DSWI_CL1_3.repository;

import pe.edu.cibertec.DSWI_CL1_3.model.ProgramaTv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProgramaTvRepository extends JpaRepository<ProgramaTv, Integer>{
    List<ProgramaTv> findAllByUserId(int id);
}
