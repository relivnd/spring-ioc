package ch.fhnw.eaf.spring.ioc.provider;

import org.springframework.stereotype.Component;

@Component
public class WelcomeProvider implements MessageProvider {
    public String getMessage(){
        return "Herzlich Willkommen";
    }
}