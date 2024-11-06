package co.chepito.seguros.seguroschepitoapiprocesador.broker;

import co.chepito.seguros.seguroschepitoapiprocesador.utils.gson.MapperJsonObjeto;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.core.MessagePropertiesBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class SenderMessageNotificacion implements MessageSender<Object> {

    private final RabbitTemplate rabbitTemplate;
    private final MapperJsonObjeto mapperJsonObjeto;

    public SenderMessageNotificacion(RabbitTemplate rabbitTemplate, MapperJsonObjeto mapperJsonObjeto){
        this.rabbitTemplate = rabbitTemplate;
        this.mapperJsonObjeto = mapperJsonObjeto;
    }

    private MessageProperties generarPropiedadMensaje(UUID idMessage){
        return MessagePropertiesBuilder.newInstance()
                .setContentType(MessageProperties.CONTENT_TYPE_JSON)
                .setHeader("idMessage", String.valueOf(idMessage))
                .build();
    }

    private Optional<Message> obtenerCuerpoMensaje(Object message, MessageProperties messageProperties){
        Optional<String> textoMensaje = mapperJsonObjeto.ejecutarGson(message);

        return textoMensaje.map(msg -> MessageBuilder.withBody(msg.getBytes())
                .andProperties(messageProperties)
                .build());
    }

    @Override
    public void execute(Object message, UUID idMessage, String exchange, String routingKey){
        MessageProperties messageProperties = generarPropiedadMensaje(idMessage);
        Optional<Message> mensaje = obtenerCuerpoMensaje(message, messageProperties);

        mensaje.ifPresent(msg -> rabbitTemplate.convertAndSend(exchange, routingKey, msg));
    }
}
