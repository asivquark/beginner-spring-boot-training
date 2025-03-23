package com.asivquark.beginnerspringboottraining

import com.asivquark.beginnerspringboottraining.practice1.User
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ApplicationTests {
    
    @Test
    fun goal1Test() {
        val user: User? = null
        
        assertThat(user).isNotNull
        assertThat(user).hasNoNullFieldsOrProperties()
    }
    
    @Test
    fun goal2Test() {
        val injectedUser: User? = null
        
        assertThat(injectedUser).isNotNull
        assertThat(injectedUser).hasNoNullFieldsOrProperties()
    }
}
