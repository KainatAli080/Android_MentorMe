package com.KainatAli.i212470

import android.content.Intent
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen2_Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2_login)

        val signup = findViewById<Button>(R.id.SignUp_btn)
        signup.paintFlags = signup.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        var ToSignUpPage_btn = findViewById<Button>(R.id.SignUp_btn)
        ToSignUpPage_btn.setOnClickListener{
            startActivity(Intent(this, Screen3_SignUp::class.java));
            finish()
        }
    }
}