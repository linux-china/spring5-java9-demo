package org.mvnsearch.spring5;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * simple spring app test
 *
 * @author linux_china
 */
@SpringJUnitConfig
@ContextConfiguration(classes = AppConfig.class)
@TestPropertySource(properties = {"timezone = GMT", "port: 4242"})
public class AppTest {
    @Value("${port}")
    private Integer port;

    @ParameterizedTest
    @ValueSource(strings = {"Hello", "World"})
    public void testApp(String argument, @Autowired UserService userService) {
        System.out.println("port: " + port);
        assertThat(userService.findNickById(1L)).contains("nick");
        System.out.println("argument: " + argument);
    }

}
