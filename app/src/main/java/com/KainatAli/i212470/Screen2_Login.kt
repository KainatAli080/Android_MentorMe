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

        // To underline text
        val signup = findViewById<Button>(R.id.SignUp_btn)
        signup.paintFlags = signup.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        //To call new screen : To redirect to Sign Up Page
        var ToSignUpPage_btn = findViewById<Button>(R.id.SignUp_btn)
        ToSignUpPage_btn.setOnClickListener{
            startActivity(Intent(this, Screen3_SignUp::class.java));
            finish()
        }

        //To call new screen : To redirect to Forgot Password Page
        var toForgotPasswordPage = findViewById<Button>(R.id.forgotPassword_btnOnLoginPage)
        toForgotPasswordPage.setOnClickListener{
            startActivity(Intent(this, Screen5_ForgotPassword::class.java));
            finish()
        }
    }
}