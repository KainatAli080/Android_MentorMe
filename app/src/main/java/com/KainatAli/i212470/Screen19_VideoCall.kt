package com.KainatAli.i212470

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen19_VideoCall : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen19_video_call)

        //1. openVoiceCallBtn_onVideoCallPage
        val openVoiceCallInstead = findViewById<Button>(R.id.openVoiceCallBtn_onVideoCallPage)
        openVoiceCallInstead.setOnClickListener{
            startActivity(Intent(this, Screen20_VoiceCall::class.java));
            finish()
        }

        //2. closeVideoCallBtn_onVideoCallPage
        val closeVideoCall = findViewById<Button>(R.id.closeVideoCallBtn_onVideoCallPage)
        closeVideoCall.setOnClickListener{
            startActivity(Intent(this, Screen7_Homepage::class.java));
            finish()
        }

    }
}