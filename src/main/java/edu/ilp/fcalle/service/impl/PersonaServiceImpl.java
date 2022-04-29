package edu.ilp.fcalle.service.impl;

import edu.ilp.fcalle.dao.IPersonaDao;
import edu.ilp.fcalle.entity.Persona;
import edu.ilp.fcalle.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaService {

    @Autowired
    private IPersonaDao personaDao;
    @Override
    public List<Persona> listarPersonas() {
        return this.personaDao.findAll();
    }

    @Override
    public Persona obtenerPersonaPorCodigo(String codigo) {
        return this.personaDao.findByCodigoPersona(codigo);    }
}
