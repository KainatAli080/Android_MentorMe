package com.KainatAli.i212470

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen22_EditProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen22_edit_profile)

        //Backbtn_onEditProfilePage
        val bProfile = findViewById<Button>(R.id.Backbtn_onEditProfilePage)
        bProfile.setOnClickListener{
            startActivity(Intent(this, Screen21_Profile::class.java));
            finish()
        }

        //updateProfileBtn_editProfilePage
        val bhome = findViewById<Button>(R.id.updateProfileBtn_editProfilePage)
        bhome.setOnClickListener{
            startActivity(Intent(this, Screen7_Homepage::class.java));
            finish()
        }
    }
}