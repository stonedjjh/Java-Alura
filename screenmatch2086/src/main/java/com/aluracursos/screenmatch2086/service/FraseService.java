package com.aluracursos.screenmatch2086.service;

import com.aluracursos.screenmatch2086.model.Frase;
import com.aluracursos.screenmatch2086.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aluracursos.screenmatch2086.dto.FraseDTO;

/**
 * Componente de la capa de servicio que contiene la lógica de negocio
 * relacionada con las frases.
 * Esta clase es gestionada por el contenedor de Spring como un bean de servicio,
 * encapsulando las operaciones de negocio y orquestando la interacción
 * con los repositorios de datos.
 */
@Service
public class FraseService {
    @Autowired
    private FraseRepository repository;

    public FraseDTO obtenerFraseAleatoria(){
        Frase frase = repository.obtenerFraseAleatoria();
        return new FraseDTO(frase.getTitulo(),frase.getFrase(),frase.getPersonaje(),frase.getPoster());
    }

}
