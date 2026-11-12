package com.educando.application.dto;

/**
 * DTO Comando para la autorizacion del Director Financiero.
 */
public record AutorizarPorDirectorCommand(Long numeroSolicitud, String cedulaDirector, double saldoPresupuesto) {}
