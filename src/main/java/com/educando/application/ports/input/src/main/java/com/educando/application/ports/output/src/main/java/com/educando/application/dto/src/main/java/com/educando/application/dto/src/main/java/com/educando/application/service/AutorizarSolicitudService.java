package com.educando.application.service;

import com.educando.application.ports.input.AutorizarSolicitudUseCase;
import com.educando.application.ports.output.SolicitudRepositorioPort;
import com.educando.application.dto.AutorizarPorJefeCommand;
import com.educando.application.dto.AutorizarPorDirectorCommand;

/**
 * Servicio de aplicacion que implementa el caso de uso de autorizacion sin tocar infraestructura.
 */
public class AutorizarSolicitudService implements AutorizarSolicitudUseCase {

    private final SolicitudRepositorioPort repositorio;

    public AutorizarSolicitudService(SolicitudRepositorioPort repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public void autorizarPorJefe(AutorizarPorJefeCommand comando) {
        Object solicitud = repositorio.buscarPorId(comando.numeroSolicitud())
            .orElseThrow(() -> new IllegalArgumentException("Solicitud no encontrada"));
        
        // Aqui se invocaria la regla de dominio del agregado
        repositorio.guardar(solicitud);
    }

    @Override
    public void autorizarPorDirectorFinanciero(AutorizarPorDirectorCommand comando) {
        Object solicitud = repositorio.buscarPorId(comando.numeroSolicitud())
            .orElseThrow(() -> new IllegalArgumentException("Solicitud no encontrada"));
        
        // Aqui se invocaria la regla de dominio del agregado
        repositorio.guardar(solicitud);
    }
}
