package com.KainatAli.i212470

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Screen7_Homepage : AppCompatActivity() {

    private lateinit var displayName:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen7_homepage)

        displayName = findViewById<TextView>(R.id.displayName)
        val intent = intent
        val name = intent.getStringExtra(Screen2_Login.PASS_NAME)
        displayName.text = name.toString()

    }
}