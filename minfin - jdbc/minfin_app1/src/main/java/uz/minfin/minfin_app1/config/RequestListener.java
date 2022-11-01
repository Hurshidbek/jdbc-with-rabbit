package uz.minfin.minfin_app1.config;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import uz.minfin.minfin_app1.service.RequestService;

@Component
@RequiredArgsConstructor
public class RequestListener {

    private final RequestService requestService;

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void logTransaction(@Payload String request) {

        requestService.save(request);
    }

}


