package ch.fhnw.eaf.spring.ioc.renderer;

import ch.fhnw.eaf.spring.ioc.provider.MessageProvider;
import org.springframework.beans.factory.annotation.Autowired;

public class StandardOutRenderer implements MessageRenderer {

    @Autowired
    private MessageProvider provider;

    @Override
    public void render() {
        System.out.println(provider.getMessage());
    }
}
