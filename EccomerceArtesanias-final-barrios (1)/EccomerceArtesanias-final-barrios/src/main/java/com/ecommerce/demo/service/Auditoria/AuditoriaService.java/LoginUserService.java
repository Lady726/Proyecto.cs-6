import com.ecommerce.demo.service.Auditoria.*;
import com.ecommerce.demo.service.auth.AuditorService;
import com.ecommerce.demo.service.auth.LoginUserDto;
import com.ecommerce.demo.service.auth.ResponseApi;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class LoginUserService {

    @Autowired
    private AuditorService auditorService;

    public ResponseApi doLogin(LoginUserDto loginUserDto) {
        try {
            // Lógica de autenticación
        } catch (Exception e) {
            auditorService.registrarError("Error en la autenticación: " + e.getMessage());
            return new ResponseApi(
                "Error en la autenticación",
                HttpStatus.INTERNAL_SERVER_ERROR,
                LocalDateTime.now());
        }
    }
}
