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

    public int getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(int idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public String getNomPersonaje() {
        return nomPersonaje;
    }

    public void setNomPersonaje(String nomPersonaje) {
        this.nomPersonaje = nomPersonaje;
    }

    public String getApePersonaje() {
        return apePersonaje;
    }

    public void setApePersonaje(String apePersonaje) {
        this.apePersonaje = apePersonaje;
    }

    public Date getFechNacPersonaje() {
        return fechNacPersonaje;
    }

    public void setFechNacPersonaje(Date fechNacPersonaje) {
        this.fechNacPersonaje = fechNacPersonaje;
    }
}
