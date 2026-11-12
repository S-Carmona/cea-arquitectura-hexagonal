package com.educando.application.ports.output;

import java.util.Optional;

/**
 * Puerto de Salida (OUT) para persistir y consultar solicitudes de compra.
 */
public interface SolicitudRepositorioPort {
    Optional<Object> buscarPorId(Long id);
    void guardar(Object solicitud);
}
