package ch.fhnw.eaf.spring.ioc;

import ch.fhnw.eaf.spring.ioc.provider.MessageProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringIocApplicationTests {

    @Autowired
    private MessageProvider provider;

    @Test
    void welcomeProvider() {
        Assertions.assertEquals("Hello World", provider.getMessage());
    }

}
