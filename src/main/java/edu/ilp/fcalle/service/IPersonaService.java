package edu.ilp.fcalle.service;

import edu.ilp.fcalle.entity.Persona;

import java.util.List;

public interface IPersonaService {

    List<Persona> listarPersonas();

    Persona obtenerPersonaPorCodigo(String codigo);
}
