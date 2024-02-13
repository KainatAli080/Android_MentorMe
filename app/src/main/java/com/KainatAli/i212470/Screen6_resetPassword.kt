package com.KainatAli.i212470

import android.content.Intent
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen6_resetPassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen6_reset_password)

        val redirectToLoginPage = findViewById<Button>(R.id.redirectToLoginPage_btnOnResetPasswordScreen)
        redirectToLoginPage.paintFlags = redirectToLoginPage.paintFlags or Paint.UNDERLINE_TEXT_FLAG
        redirectToLoginPage.setOnClickListener{
            startActivity(Intent(this, Screen2_Login::class.java));
            finish()
        }

        val doneResetting = findViewById<Button>(R.id.resetBtn_redirectToLoginPage)
        doneResetting.setOnClickListener{
            startActivity(Intent(this, Screen2_Login::class.java));
            finish()
        }
    }
}