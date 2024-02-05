package com.KainatAli.i212470

import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.Toast

class Screen3_SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3_sign_up)

        val loginPage = findViewById<Button>(R.id.loginPage_btn)
        loginPage.paintFlags = loginPage.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        var ToLoginPage_btn = findViewById<Button>(R.id.loginPage_btn)
        ToLoginPage_btn.setOnClickListener{
            startActivity(Intent(this, Screen2_Login::class.java));
        }


//        var btn = findViewById<CircleImageView>(R.id.main)
//
//        btn.setOnClickListener {
//            startActivity(
//
//                Intent(this,
//                    SecondActivity::class.java)
//            );
//        }


    }
}