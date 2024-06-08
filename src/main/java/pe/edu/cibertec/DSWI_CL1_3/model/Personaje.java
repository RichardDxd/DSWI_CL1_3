package pe.edu.cibertec.DSWI_CL1_3.model;

import lombok.Data;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPersonaje;

    private String nomPersonaje;
    private String apePersonaje;
    private Date fechNacPersonaje;
}
