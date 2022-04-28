package com.evolve.dagger2

import android.util.Log
import javax.inject.Inject

interface NotificationService
{
    fun send(to : String, from : String, body: String)
}

class EmailService @Inject constructor() :NotificationService {
    override fun send(to : String, from : String, body: String)
    {
        Log.d("TAG", "Email Sent: ")
    }
}

class MessageService : NotificationService
{
    override fun send(to: String, from: String, body: String) {
//        TODO("Not yet implemented")
        Log.d("TAG", "Message sent")
    }

}