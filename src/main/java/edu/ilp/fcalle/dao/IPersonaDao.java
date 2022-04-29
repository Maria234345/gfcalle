package edu.ilp.fcalle.dao;

import edu.ilp.fcalle.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IPersonaDao extends JpaRepository<Persona, Long> {

    @Query("SELECT p FROM Persona p WHERE p.idpersona = ?1")
    Persona findByCodigoPersona(String codigo);
}