package com.KainatAli.i212470

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.graphics.Paint

class Screen5_ForgotPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen5_forgot_password)

        val redirectToLogin = findViewById<Button>(R.id.redirectToLoginPage_fromForgotPassword_btn)
        redirectToLogin.paintFlags = redirectToLogin.paintFlags or Paint.UNDERLINE_TEXT_FLAG
        redirectToLogin.setOnClickListener{
            startActivity(Intent(this, Screen2_Login::class.java));
            finish()
        }

        val redirectToResetPassword = findViewById<Button>(R.id.verify_btn_verifyPage)
        redirectToResetPassword.setOnClickListener{
            startActivity(Intent(this, Screen6_resetPassword::class.java));
            finish()
        }
    }
}