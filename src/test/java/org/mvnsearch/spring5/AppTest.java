package org.mvnsearch.spring5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * simple app test
 *
 * @author linux_china
 */
public class AppTest {

    @Test
    public void testApp() {
        assertThat("good morning").contains("good");
    }
}
