package org.mvnsearch.spring5

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.mvnsearch.spring5.impl.UserServiceImpl
import org.springframework.context.support.BeanDefinitionDsl
import org.springframework.context.support.GenericApplicationContext
import org.springframework.context.support.beans

/**
 * spring DSL test
 *
 * @author linux_china
 */
@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
class SpringDSLTest {
    val appContext = GenericApplicationContext()

    @BeforeAll
    fun setUp() {
        beans {
            bean<UserServiceImpl>("userService", scope = BeanDefinitionDsl.Scope.SINGLETON)
        }(appContext)
        appContext.refresh()
    }


    @Test
    fun testSpike() {
        println(appContext.getBean("userService"))
        println("good")
    }
}