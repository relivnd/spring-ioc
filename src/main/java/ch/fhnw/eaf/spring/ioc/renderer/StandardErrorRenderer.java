package ch.fhnw.eaf.spring.ioc.renderer;

import ch.fhnw.eaf.spring.ioc.provider.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StandardErrorRenderer implements MessageRenderer {

    @Autowired
    private MessageProvider provider;

    @Override
    public void render() {
        System.err.println(provider.getMessage().toUpperCase());
    }
}
