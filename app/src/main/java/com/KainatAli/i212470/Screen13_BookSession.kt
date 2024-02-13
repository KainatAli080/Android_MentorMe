package com.KainatAli.i212470

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen13_BookSession : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen13_book_session)

        //1. bookAppointmentBtn_onBookSessionPage
        val bookAppointment = findViewById<Button>(R.id.bookAppointmentBtn_onBookSessionPage)
        bookAppointment.setOnClickListener{
            startActivity(Intent(this, Screen7_Homepage::class.java));
            finish()
        }

        //2. openChat_JohnCoopers
        val jonC = findViewById<Button>(R.id.openChat_JohnCoopers)
        jonC.setOnClickListener{
            startActivity(Intent(this, Screen15_JohnCooperChat::class.java));
            finish()
        }
        //3. openVoiceCall_JohnCoopers
        val jonV = findViewById<Button>(R.id.openVoiceCall_JohnCoopers)
        jonV.setOnClickListener{
            startActivity(Intent(this, Screen20_VoiceCall::class.java));
            finish()
        }
        //4. openVideoCall_JohnCoopers
        val jonVC = findViewById<Button>(R.id.openVideoCall_JohnCoopers)
        jonVC.setOnClickListener{
            startActivity(Intent(this, Screen19_VideoCall::class.java));
            finish()
        }

        //5. Backbtn_onBookSessionPage (send back to mentor info page)
        val toMentorInfoPage = findViewById<Button>(R.id.Backbtn_onBookSessionPage)
        toMentorInfoPage.setOnClickListener{
            startActivity(Intent(this, Screen10_MentorInfoPage::class.java));
            finish()
        }
    }
}