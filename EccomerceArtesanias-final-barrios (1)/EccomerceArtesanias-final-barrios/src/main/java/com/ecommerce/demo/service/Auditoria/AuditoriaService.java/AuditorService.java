package com.ecommerce.demo.service.Auditoria.Auditoria;

import org.springframework.stereotype.Service;

@Service
public class AuditorService {
    
    private static AuditorService instance;

    private AuditorService() {
        // Constructor privado para evitar instanciación externa
    }

    public static synchronized AuditorService getInstance() {
        if (instance == null) {
            instance = new AuditorService();
        }
        return instance;
    }

    public void registrarError(String mensajeError) {
        // Lógica para registrar el error en el log
        System.out.println("Error registrado: " + mensajeError);
    }
}

