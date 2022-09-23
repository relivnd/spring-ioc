package ch.fhnw.eaf.spring.ioc.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class HelloWorldProvider implements MessageProvider {

    @Value("${string.message:Message Not Found}")
    private String message;

    public String getMessage(){
        return message;
    }
}
