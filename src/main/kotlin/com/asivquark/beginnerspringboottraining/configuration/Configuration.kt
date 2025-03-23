package com.asivquark.beginnerspringboottraining.configuration

import com.asivquark.beginnerspringboottraining.practice1.User
import com.asivquark.beginnerspringboottraining.practice1.User.Email
import com.asivquark.beginnerspringboottraining.practice1.User.FullName
import com.asivquark.beginnerspringboottraining.practice1.User.FullName.FirstName
import com.asivquark.beginnerspringboottraining.practice1.User.FullName.LastName
import com.asivquark.beginnerspringboottraining.practice1.User.Phone
import com.asivquark.beginnerspringboottraining.practice1.User.Phone.PhoneNumber
import com.asivquark.beginnerspringboottraining.practice1.User.Phone.PrefixCountryCode
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Configuration {
    
    @Bean
    fun email() = User.Email("info@cosmiccodingcommunityclub.com")
    
    @Bean
    fun firstName() = User.FullName.FirstName("Jordi")
    
    @Bean
    fun lastName() = User.FullName.LastName("Jiménez Guil")
    
    @Bean
    fun fullName(firstName: FirstName, lastName: LastName) =
        User.FullName(firstName, lastName)
    
    @Bean
    fun prefixCountryCode() =
        User.Phone.PrefixCountryCode(34)
    
    @Bean
    fun phoneNumber() =
        User.Phone.PhoneNumber(612123123)
    
    @Bean
    fun phone(prefixCountryCode: PrefixCountryCode, phoneNumber: PhoneNumber) =
        User.Phone(prefixCountryCode, phoneNumber)
    
    @Bean
    fun user(email: Email, fullName: FullName, phone: Phone) =
        User(email, fullName, phone)
}