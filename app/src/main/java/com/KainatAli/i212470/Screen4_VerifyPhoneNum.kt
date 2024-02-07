package com.KainatAli.i212470

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.button.MaterialButton
import android.util.Log

class Screen4_VerifyPhoneNum : AppCompatActivity() {

    private lateinit var phone_number:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen4_verify_phone_num)

        phone_number = findViewById<TextView>(R.id.display_pnum)
        val intent = intent
        val phoneNumber = intent.getStringExtra(Screen3_SignUp.EXTRA_MESSAGE)
        phone_number.text = phoneNumber.toString()

        val back_btn = findViewById<MaterialButton>(R.id.back_btn_toSignUp)
        back_btn.setOnClickListener{
            startActivity(Intent(this, Screen3_SignUp::class.java));
            finish()
        }
    }
}