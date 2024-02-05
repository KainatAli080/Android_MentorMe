package com.KainatAli.i212470

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler

class MainActivity : AppCompatActivity() {

    private val introPage_displayTime: Long = 5000  // 2 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            //Create an Intenet to navigate to Login Page
            val intent = Intent(this@MainActivity, Screen2_Login::class.java)
            startActivity(intent)

            // Finish the current activity to prevent going back to the splash screen
            finish()
        }, introPage_displayTime)

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