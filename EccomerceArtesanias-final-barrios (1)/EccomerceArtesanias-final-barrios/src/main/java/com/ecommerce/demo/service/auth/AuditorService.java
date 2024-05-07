package com.ecommerce.demo.service.auth;

import org.springframework.stereotype.Service;

@Service
public class AuditorService {

    public void registrarError(String usuario, String accion) {
        // Implementa la lógica para registrar el error en el log
        // Esto incluye verificar si el usuario realizó más de dos veces seguidas la acción y luego registrar el error en el log
    }
}
