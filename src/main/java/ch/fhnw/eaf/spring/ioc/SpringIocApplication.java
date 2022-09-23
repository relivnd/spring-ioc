package ch.fhnw.eaf.spring.ioc;

import ch.fhnw.eaf.spring.ioc.renderer.MessageRenderer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("/app-config.xml")
public class SpringIocApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringIocApplication.class, args);
    }

    @Autowired
    BeanFactory context;

    @Override
    public void run(String... args) {
        MessageRenderer renderer = (MessageRenderer) context.getBean("messageRenderer");
        renderer.render();
    }
}
