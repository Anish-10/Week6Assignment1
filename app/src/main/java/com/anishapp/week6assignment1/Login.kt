package com.anishapp.week6assignment1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText

class Login : AppCompatActivity() {
    private lateinit var Username:EditText
    private lateinit var Password:EditText
    private lateinit var Login:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Username = findViewById(R.id.Username)
        Password = findViewById(R.id.Password)
        Login = findViewById(R.id.Login)

        Login.setOnClickListener {
            if(checkNull())
            {
                login()
            }
        }
    }

    private fun checkNull():Boolean
    {
        var check = true
        if(TextUtils.isEmpty(Username.text.toString()))
        {
            Username.error = "Username or password is incorrect"
            Username.requestFocus()
            check = false
        }
        else if (TextUtils.isEmpty(Password.text.toString()))
        {
            Username.error = "Username or password is incorrect"
            Username.requestFocus()
            check = false
        }
        return check
    }

    private fun login()
    {
        if(Username.text.toString()=="softwarica" && Password.text.toString() == "coventry")
        {
            val intent = Intent(this,Dashboard::class.java)
            startActivity(intent)
            finish()
        }
    }
}