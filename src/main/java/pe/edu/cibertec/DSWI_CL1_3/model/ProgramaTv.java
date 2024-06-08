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

    public int getIdProgramaTv() {
        return idProgramaTv;
    }

    public void setIdProgramaTv(int idProgramaTv) {
        this.idProgramaTv = idProgramaTv;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }
}
