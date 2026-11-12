package com.educando.infrastructure.adapters.output;

import com.educando.application.ports.output.SolicitudRepositorioPort;
import java.util.Optional;

/**
 * Adaptador de Salida que implementa la persistencia en base de datos mediante JDBC.
 */
public class SolicitudRepositorioJdbc implements SolicitudRepositorioPort {

    @Override
    public Optional<Object> buscarPorId(Long id) {
        // Logica para consultar en la base de datos mediante JDBC
        return Optional.empty();
    }

    @Override
    public void guardar(Object solicitud) {
        // Logica para guardar en la base de datos mediante JDBC
    }
}
