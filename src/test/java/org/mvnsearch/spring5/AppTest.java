package org.mvnsearch.spring5;

import org.junit.jupiter.api.Test;
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

    @Autowired
    private UserService userService;

    @Value("${port}")
    private Integer port;

    @Test
    public void testApp() {
        System.out.println("port: " + port);
        assertThat(userService.findNickById(1L)).contains("nick");
    }
}
