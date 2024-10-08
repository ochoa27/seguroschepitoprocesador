package co.chepito.seguros.seguroschepitoapiprocesador.data.entity.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Table(name="usuarios")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioEntity {

	@Id
	private UUID id;
    private String nombre;
    private String apellido;
    private String tipoIdentificacion;
    private String identificacion;
    private String contrasena;
    private String correo;
    private String rol;
    private String ciudad;
    private String direccion;
    private String correoEmergencia;
    private String numeroContacto;


    
	    
}
