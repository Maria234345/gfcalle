package edu.ilp.fcalle.controller;

import edu.ilp.fcalle.entity.Persona;
import edu.ilp.fcalle.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("login")
public class PruebaController {

    @Autowired
    private IPersonaService personaService;

    @GetMapping("/listaPersonas")
    public List<Persona> listaPersonas(){
        return this.personaService.listarPersonas();
    }

    @GetMapping("/buscarPersonaByCodigo")
    public Persona buscarPersonaByCodigo(@RequestParam String codigo){
        return this.personaService.obtenerPersonaPorCodigo(codigo);
    }

    @GetMapping("/saludo")
    public String saludo(){
        return "Hola amig@s desde Ayacucho - perú";
    }

    @GetMapping("/bienvenido")
    public String identificacion(@RequestParam String datos){
        return "Bienvenido a la Pontificia: " + datos;
    }

}
