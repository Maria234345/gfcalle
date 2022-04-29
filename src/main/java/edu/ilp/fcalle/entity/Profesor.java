package edu.ilp.fcalle.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "profesor")
@PrimaryKeyJoinColumn(referencedColumnName="IDPERSONA")
public class Profesor extends Persona{

    @Column(name = "salario", length = 15)
    private String salario;

    public Profesor() {
    }

    public Profesor(String salario) {
        this.salario = salario;
    }

    public Profesor(Long idpersona, String nombre, String telefono, String email, String salario) {
        super(idpersona, nombre, telefono, email);
        this.salario = salario;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }
}
