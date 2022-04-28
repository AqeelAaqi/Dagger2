package com.evolve.dagger2

import com.evolve.dagger2.Anotations.MessageQualifier
import javax.inject.Inject
import javax.inject.Named

// constructor injection
class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    @MessageQualifier private val notificationService: NotificationService
) {

    fun registerUser(email: String, password: String)
    {
        userRepository.saveUser(email,password)
        notificationService.send(email,"no-reply@eis.sg","Dagger2")
    }
}