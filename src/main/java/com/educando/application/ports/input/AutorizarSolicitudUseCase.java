package com.educando.application.ports.input;

import com.educando.application.dto.AutorizarPorJefeCommand;
import com.educando.application.dto.AutorizarPorDirectorCommand;

/**
 * Puerto de Entrada (IN) que define las operaciones del caso de uso de autorizacion.
 */
public interface AutorizarSolicitudUseCase {
    void autorizarPorJefe(AutorizarPorJefeCommand comando);
    void autorizarPorDirectorFinanciero(AutorizarPorDirectorCommand comando);
}
