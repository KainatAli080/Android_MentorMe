package com.KainatAli.i212470

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen20_VoiceCall : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen20_voice_call)

        //1. openVideoCallBtn_onVoiceCallPage
        val openVideoCallInstead = findViewById<Button>(R.id.openVideoCallBtn_onVoiceCallPage)
        openVideoCallInstead.setOnClickListener{
            startActivity(Intent(this, Screen19_VideoCall::class.java));
            finish()
        }

        //2. closeVoiceCall_onVoiceCallPage
        val closeVoiceCallInstead = findViewById<Button>(R.id.closeVoiceCall_onVoiceCallPage)
        closeVoiceCallInstead.setOnClickListener{
            startActivity(Intent(this, Screen7_Homepage::class.java));
            finish()
        }
    }
}