package com.educando.infrastructure.adapters.input;

import com.educando.application.ports.input.AutorizarSolicitudUseCase;
import com.educando.application.dto.AutorizarPorJefeCommand;

/**
 * Adaptador de Entrada (REST Controller) que recibe las solicitudes HTTP y llama al puerto de entrada.
 */
public class SolicitudController {

    private final AutorizarSolicitudUseCase autorizarSolicitudUseCase;

    public SolicitudController(AutorizarSolicitudUseCase autorizarSolicitudUseCase) {
        this.autorizarSolicitudUseCase = autorizarSolicitudUseCase;
    }

    public void autorizarPorJefe(Long numeroSolicitud, String cedulaJefe) {
        AutorizarPorJefeCommand command = new AutorizarPorJefeCommand(numeroSolicitud, cedulaJefe);
        autorizarSolicitudUseCase.autorizarPorJefe(command);
    }
}
