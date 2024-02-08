package com.KainatAli.i212470

import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.EditText
import android.widget.Toast

class Screen3_SignUp : AppCompatActivity() {
    companion object{
        val EXTRA_MESSAGE = "phone_number"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3_sign_up)

        val loginPage = findViewById<Button>(R.id.loginPage_btn)
        loginPage.paintFlags = loginPage.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        // to shift back to login page if account already exists
        var ToLoginPage_btn = findViewById<Button>(R.id.loginPage_btn)
        ToLoginPage_btn.setOnClickListener{
            startActivity(Intent(this, Screen2_Login::class.java));
            finish()
        }

        // Assume phoneNumberEditText is the EditText where the user enters the phone number
        val phoneNumber = findViewById<EditText>(R.id.contactNum_Input)

        val SignUp = findViewById<Button>(R.id.SignUpFinished_btn)
        SignUp.setOnClickListener {
            val pnum = phoneNumber.text.toString()
            val intent = Intent(this, Screen4_VerifyPhoneNum::class.java)
            intent.putExtra("phone_number", pnum)
            startActivity(intent)
            finish()
        }

        //Upon finishing sign up, redirect to login Page
        var LoginPage = findViewById<Button>(R.id.SignUpFinished_btn)
        LoginPage.setOnClickListener{
            startActivity(Intent(this, Screen2_Login::class.java));
            finish()
        }
    }
}