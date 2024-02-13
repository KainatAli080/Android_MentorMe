package com.KainatAli.i212470

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen23_ShowBookedSessions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen23_show_booked_sessions)

        //backButton_onBookedSessionsPage
        val backB = findViewById<Button>(R.id.backButton_onBookedSessionsPage)
        backB.setOnClickListener{
            startActivity(Intent(this, Screen21_Profile::class.java));
            finish()
        }
    }
}