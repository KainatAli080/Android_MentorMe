package com.KainatAli.i212470

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen24_NotificationsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen24_notifications_page)

        // 1. backButton_onNotificationPage, send back home
        // Redirecting to Home Page from notification
        val goBackHome = findViewById<Button>(R.id.backButton_onNotificationPage)
        goBackHome.setOnClickListener{
            startActivity(Intent(this, Screen7_Homepage::class.java));
            finish()
        }
    }
}