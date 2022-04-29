package edu.ilp.fcalle.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName="IDPERSONA")
public class Estudiante extends Persona{


    @Column(name = "codigo", length = 15)
    private String Codigo;

    @Column(name = "serie", length = 50)
    private String Serie;

    @Column(name = "verificar_serie", length = 50)
    private String verificarSerie;

    public Estudiante() {
    }

    public Estudiante(String codigo, String serie, String verificarSerie) {
        Codigo = codigo;
        Serie = serie;
        this.verificarSerie = verificarSerie;
    }

    public Estudiante(Long idpersona, String nombre, String telefono, String email, String codigo, String serie, String verificarSerie) {
        super(idpersona, nombre, telefono, email);
        Codigo = codigo;
        Serie = serie;
        this.verificarSerie = verificarSerie;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getSerie() {
        return Serie;
    }

    public void setSerie(String serie) {
        Serie = serie;
    }

    public String getVerificarSerie() {
        return verificarSerie;
    }

    public void setVerificarSerie(String verificarSerie) {
        this.verificarSerie = verificarSerie;
    }
}

