package com.asivquark.beginnerspringboottraining

import com.asivquark.beginnerspringboottraining.practice1.User
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ApplicationTests {
    
    @Autowired
    private lateinit var injectedUser : User
    
    @Test
    fun goal1Test() {
        val email = User.Email("info@cosmiccodingcommunityclub.com")
        
        val firstName = User.FullName.FirstName("Jordi")
        val lastName = User.FullName.LastName("Jiménez Guil")
        val fullName = User.FullName(firstName, lastName)
        
        val prefixCountryCode = User.Phone.PrefixCountryCode(34)
        val phoneNumber = User.Phone.PhoneNumber(612123123)
        val phone = User.Phone(prefixCountryCode, phoneNumber)
        
        val user = User(email, fullName, phone)
        
        assertThat(user).isNotNull
        assertThat(user).hasNoNullFieldsOrProperties()
    }
    
    @Test
    fun goal2Test() {
        assertThat(injectedUser).isNotNull
        assertThat(injectedUser).hasNoNullFieldsOrProperties()
    }
}
