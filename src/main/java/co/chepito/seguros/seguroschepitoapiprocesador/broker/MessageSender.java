package co.chepito.seguros.seguroschepitoapiprocesador.broker;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public interface MessageSender<T> {

    void execute(T message, UUID idMessage, String exchange, String routingKey);
}