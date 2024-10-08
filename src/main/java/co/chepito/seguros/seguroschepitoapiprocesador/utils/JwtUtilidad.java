package co.chepito.seguros.seguroschepitoapiprocesador.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import java.util.Date;
import java.util.function.Function;

@Component
public class JwtUtilidad {

    // Clave secreta para la firma del JWT (debe ser segura y con suficiente longitud)
    private static final String SECRET = "secret";

    // Extrae el nombre de usuario del token
    public String extraerNombreUsuario(String token) {
        return extraerReclamacion(token, Claims::getSubject);
    }

    // Extrae la fecha de expiración del token
    public Date extraerExpiracion(String token) {
        return extraerReclamacion(token, Claims::getExpiration);
    }

    // Extrae una reclamación específica del token
    private <T> T extraerReclamacion(String token, Function<Claims, T> reclamacionResolver) {
        final Claims reclamaciones = extraerTodasLasReclamaciones(token);
        return reclamacionResolver.apply(reclamaciones);
    }

    // Extrae todas las reclamaciones del token
    private Claims extraerTodasLasReclamaciones(String token) {
        return Jwts.parser()
                .setSigningKey(SECRET.getBytes())
                .parseClaimsJws(token)
                .getBody();
    }

    // Verifica si el token ha expirado
    private Boolean esTokenExpirado(String token) {
        return extraerExpiracion(token).before(new Date());
    }

    // Genera un token JWT
    public String generarToken(UserDetails userDetails) {
        return crearToken(userDetails.getUsername());
    }

    // Crea un token JWT con el sujeto
    private String crearToken(String sujeto) {
        return Jwts.builder()
                .setSubject(sujeto)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10)) // 10 horas
                .signWith(SignatureAlgorithm.HS256, SECRET.getBytes())
                .compact();
    }

    // Valida el token JWT
    public Boolean validarToken(String token, UserDetails userDetails) {
        final String nombreUsuario = extraerNombreUsuario(token);
        return (nombreUsuario.equals(userDetails.getUsername()) && !esTokenExpirado(token));
    }
}
