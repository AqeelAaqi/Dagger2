package com.evolve.dagger2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    //Field Injection
    @Inject
    lateinit var userRegistrationService : UserRegistrationService
    @Inject
    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()
        component.inject(this)

//        val userRepository = UserRepository()
//        val emailService = EmailService()
//
//        val userRegistrationService = UserRegistrationService(userRepository,emailService);


//        val userRegistrationService = component.getUserRegistrationService()
//        val emailService = component.getEmailService()


        userRegistrationService.registerUser("no-reply@eis.sg","123456")
    }
}