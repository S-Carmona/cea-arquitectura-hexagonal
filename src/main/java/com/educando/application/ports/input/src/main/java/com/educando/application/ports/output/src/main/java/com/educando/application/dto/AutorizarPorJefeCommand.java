package com.educando.application.dto;

/**
 * DTO Comando para la autorizacion del jefe de area.
 */
public record AutorizarPorJefeCommand(Long numeroSolicitud, String cedulaJefe) {}
