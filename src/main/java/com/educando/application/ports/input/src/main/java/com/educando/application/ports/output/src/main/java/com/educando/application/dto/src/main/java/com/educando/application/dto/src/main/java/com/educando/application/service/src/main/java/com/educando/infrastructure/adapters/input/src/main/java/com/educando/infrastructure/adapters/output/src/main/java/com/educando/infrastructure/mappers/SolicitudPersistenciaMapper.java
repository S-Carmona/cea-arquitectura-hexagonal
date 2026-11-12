package com.educando.infrastructure.mappers;

/**
 * Capa de Anticorrupcion (ACL) / Mapper que traduce entre entidades de persistencia y el Dominio.
 */
public class SolicitudPersistenciaMapper {

    public Object aEntidadPersistencia(Object dominio) {
        // Mapea del objeto de Dominio a la entidad técnica de BD
        return new Object();
    }

    public Object aDominio(Object entidadPersistencia) {
        // Mapea de la entidad tecnica de BD al objeto de Dominio
        return new Object();
    }
}
