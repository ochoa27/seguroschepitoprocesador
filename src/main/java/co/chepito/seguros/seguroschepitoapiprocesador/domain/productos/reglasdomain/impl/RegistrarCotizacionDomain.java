package co.chepito.seguros.seguroschepitoapiprocesador.domain.productos.reglasdomain.impl;

import co.chepito.seguros.seguroschepitoapiprocesador.domain.productos.reglasdomain.SeguroExistente;
import co.chepito.seguros.seguroschepitoapiprocesador.domain.productos.reglasdomain.UsuarioExistente;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RegistrarCotizacionDomain {
    private SeguroExistente seguroExistente;
    private UsuarioExistente usuarioExistente;

    public RegistrarCotizacionDomain(SeguroExistente seguroExistente, UsuarioExistente usuarioExistente) {
        this.seguroExistente = seguroExistente;
        this.usuarioExistente = usuarioExistente;
    }

    public void validacionReglasDominio(UUID idSeguro, UUID idUsuario){
        seguroExistente.validacionReglaId(idSeguro);
        usuarioExistente.validacionReglaId(idUsuario);
    }
}
