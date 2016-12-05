package org.mvnsearch.spring5;

import org.mvnsearch.spring5.impl.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * app config
 *
 * @author linux_china
 */
@Configuration
public class AppConfig {

    @Bean
    public UserService userService() {
        return new UserServiceImpl();
    }

}
