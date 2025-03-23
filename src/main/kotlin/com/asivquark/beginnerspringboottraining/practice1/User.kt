package com.asivquark.beginnerspringboottraining.practice1


class User(
    val email: Email,
    val fullName: FullName,
    val phone: Phone
) {
    
    class Email(val email: String)
    
    class FullName(val firstName: FirstName, val lastName: LastName) {
        class FirstName(val firstNameLiteral: String)
        class LastName(val lastNameLiteral: String)
    }
    
    class Phone(val prefixCountryCode: PrefixCountryCode, val phoneNumber: PhoneNumber) {
        class PrefixCountryCode(val code: Int)
        class PhoneNumber(val phoneNumber: Long)
    }
}