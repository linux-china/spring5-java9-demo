package org.mvnsearch.spring5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * simple spring app test
 *
 * @author linux_china
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class AppTest {

    @Autowired
    private UserService userService;

    @Test
    public void testApp() {
        assertThat(userService.findNickById(1L)).contains("nick");
    }
}
