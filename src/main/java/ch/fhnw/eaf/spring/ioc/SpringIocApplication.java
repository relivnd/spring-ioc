package ch.fhnw.eaf.spring.ioc;

import ch.fhnw.eaf.spring.ioc.renderer.MessageRenderer;
import ch.fhnw.eaf.spring.ioc.renderer.MessageRendererConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringIocApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringIocApplication.class, args);
    }

    @Autowired
    MessageRendererConfig config;


    @Override
    public void run(String... args) {
        MessageRenderer renderer = config.getStandardOutMessageRenderer();
        renderer.render();

        renderer = config.getStandardErrorMessageRenderer();
        renderer.render();
    }
}
