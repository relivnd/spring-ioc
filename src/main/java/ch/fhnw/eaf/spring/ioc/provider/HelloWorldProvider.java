package ch.fhnw.eaf.spring.ioc.provider;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class HelloWorldProvider implements MessageProvider {
    public String getMessage(){
        return "Hello World";
    }
}
