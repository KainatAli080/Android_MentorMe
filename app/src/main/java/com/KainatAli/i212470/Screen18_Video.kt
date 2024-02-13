package com.KainatAli.i212470

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen18_Video : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen18_video)

        //1. Camerabtn_onVideoPage
        val takePhoto = findViewById<Button>(R.id.Camerabtn_onVideoPage)
        takePhoto.setOnClickListener{
            startActivity(Intent(this, Screen17_Photo::class.java));
            finish()
        }

        //2. closeVideoBtn_onVideoPage
        val closeVideo = findViewById<Button>(R.id.closeVideoBtn_onVideoPage)
        closeVideo.setOnClickListener{
            startActivity(Intent(this, Screen7_Homepage::class.java));
            finish()
        }
    }
}