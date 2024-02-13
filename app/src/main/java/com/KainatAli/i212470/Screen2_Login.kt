package com.KainatAli.i212470

import android.content.Intent
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Screen2_Login : AppCompatActivity() {
    companion object{
        val PASS_NAME = "Name"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2_login)

        // To underline text
        val signup = findViewById<Button>(R.id.SignUpInstead_btn)
        signup.paintFlags = signup.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        //To call new screen : To redirect to Sign Up Page
        var ToSignUpPage_btn = findViewById<Button>(R.id.SignUpInstead_btn)
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

        //To call new screen : To redirect to Home Page, login done
        val email = findViewById<EditText>(R.id.Email_Input_onLoginPage)
        val loginSuccessful = findViewById<Button>(R.id.loginBtn_toHomePage)
        loginSuccessful.setOnClickListener{
            val name = email.text.toString()
            val intent = Intent(this, Screen7_Homepage::class.java)
            intent.putExtra("Name", name)
            startActivity(intent)
            finish()
        }
    }
}
