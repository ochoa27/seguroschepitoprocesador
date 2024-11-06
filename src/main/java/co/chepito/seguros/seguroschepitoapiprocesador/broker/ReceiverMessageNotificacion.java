package co.chepito.seguros.seguroschepitoapiprocesador.broker;

import co.chepito.seguros.seguroschepitoapiprocesador.data.mapper.concrete.NotificacionMapperEntity;
import co.chepito.seguros.seguroschepitoapiprocesador.domain.notificaciones.NotificacionDomain;
import co.chepito.seguros.seguroschepitoapiprocesador.repository.notificaciones.NotificacionRepository;
import co.chepito.seguros.seguroschepitoapiprocesador.utils.gson.MapperJsonObjeto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ReceiverMessageNotificacion {
    private final NotificacionRepository notificacionRepository;
    private final MapperJsonObjeto mapperJsonObjeto;
    private final NotificacionMapperEntity notificacionMapperEntity;


    public ReceiverMessageNotificacion(NotificacionRepository notificacionRepository, MapperJsonObjeto mapperJsonObjeto, NotificacionMapperEntity notificacionMapperEntity) {
        this.notificacionRepository = notificacionRepository;
        this.mapperJsonObjeto = mapperJsonObjeto;
        this.notificacionMapperEntity = notificacionMapperEntity;
    }


    @RabbitListener(queues = "notificacion")
    public void receiveMessageNotificacion(String json)
    {
        Optional<MessageEvent> messageEvent = mapperJsonObjeto.ejecutar(json, MessageEvent.class);
        messageEvent.ifPresent(msg -> {
            Optional<NotificacionDomain> data = mapperJsonObjeto.ejecutarDesdeJson(msg.getMessage(), NotificacionDomain.class);
            data.ifPresent(notificacion -> {
                switch (msg.getEvent()){
                    case "creacion":
                    case "eliminacion":
                        notificacionRepository.deleteById(notificacion.getNotificacionId());
                    break;
                }
            });
        });
    }
}
