package pe.edu.cibertec.DSWI_CL1_3.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data

public class ProgramaTv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProgramaTv;

    private String titulo;
    private String resumen;
    private Date fechaInicio;

    @ManyToOne
    @JoinColumn(name = "idPersonaje", nullable = false)
    private Personaje personaje;
}
