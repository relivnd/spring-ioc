package ch.fhnw.eaf.spring.ioc.renderer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageRendererConfig {

    @Bean
    public StandardOutRenderer getStandardOutMessageRenderer(){
        return new StandardOutRenderer();
    }

    @Bean
    public StandardErrorRenderer getStandardErrorMessageRenderer(){
        return new StandardErrorRenderer();
    }

}
