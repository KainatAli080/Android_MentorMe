package com.KainatAli.i212470

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen17_Photo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen17_photo)

        // Videobtn_onCameraPage
        val takeVideo = findViewById<Button>(R.id.Videobtn_onCameraPage)
        takeVideo.setOnClickListener{
            startActivity(Intent(this, Screen18_Video::class.java));
            finish()
        }

        //2. closeVideoBtn_onVideoPage
        val closeCamera = findViewById<Button>(R.id.closeCameraBtn_onPhotoPage)
        closeCamera.setOnClickListener{
            startActivity(Intent(this, Screen7_Homepage::class.java));
            finish()
        }
    }
}