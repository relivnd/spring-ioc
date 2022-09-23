package ch.fhnw.eaf.spring.ioc.renderer;

import ch.fhnw.eaf.spring.ioc.provider.HelloWorldProvider;
import ch.fhnw.eaf.spring.ioc.provider.MessageProvider;
import org.springframework.context.annotation.Primary;

@Primary
public class StandardOutRenderer implements MessageRenderer {

    private MessageProvider provider;

    @Override
    public void render() {
        System.out.println(provider.getMessage());
    }

    public void setProvider(HelloWorldProvider provider) {
        this.provider = provider;
    }
}
