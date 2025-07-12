package com.aluracursos.screenmatch2086.controller;

import com.aluracursos.screenmatch2086.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.aluracursos.screenmatch2086.dto.FraseDTO;

/**
 * Controlador REST para manejar las solicitudes relacionadas con las frases.
 * Combina las funcionalidades de @Controller y @ResponseBody,
 * lo que significa que los métodos de este controlador devuelven directamente
 * objetos Java que Spring serializa automáticamente a JSON/XML.
 */
@RestController
public class FraseController {
    /**
     * Inyecta automáticamente una instancia de FraseService.
     * Spring se encarga de crear y proporcionar el bean del servicio
     * a este controlador, siguiendo el principio de Inversión de Control (IoC).
     */
    @Autowired
    FraseService servicio;

    @GetMapping("series/frases")
    public FraseDTO obtenerFraseAleatoria(){
        return servicio.obtenerFraseAleatoria();
    }
}
