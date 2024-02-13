package com.KainatAli.i212470

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen21_Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen21_profile)

        //backButton_onProfilePage
        val b = findViewById<Button>(R.id.backButton_onProfilePage)
        b.setOnClickListener{
            startActivity(Intent(this, Screen7_Homepage::class.java));
            finish()
        }

        //editProfileBtn_onProfilePage
        val editP = findViewById<Button>(R.id.editProfileBtn_onProfilePage)
        editP.setOnClickListener{
            startActivity(Intent(this, Screen22_EditProfile::class.java));
            finish()
        }

        //bookedSessionsPagebtn_onProfilePage
        val show = findViewById<Button>(R.id.bookedSessionsPagebtn_onProfilePage)
        show.setOnClickListener{
            startActivity(Intent(this, Screen23_ShowBookedSessions::class.java));
            finish()
        }

        //Homebtn_onProfilePage_BottomNav
        val h = findViewById<Button>(R.id.Homebtn_onProfilePage_BottomNav)
        h.setOnClickListener{
            startActivity(Intent(this, Screen7_Homepage::class.java));
            finish()
        }
        //Searchbtn_onProfilePage_BottomNav
        val se = findViewById<Button>(R.id.Searchbtn_onProfilePage_BottomNav)
        se.setOnClickListener{
            startActivity(Intent(this, Screen8_Searching::class.java));
            finish()
        }
        //Plusbtn_onProfilePage_onBottomNav
        val pl = findViewById<Button>(R.id.Plusbtn_onProfilePage_onBottomNav)
        pl.setOnClickListener{
            startActivity(Intent(this, Screen12_AddNewMentor::class.java));
            finish()
        }
        //Chatbtn_onProfilePage_bottomNav
        val ch = findViewById<Button>(R.id.Chatbtn_onProfilePage_bottomNav)
        ch.setOnClickListener{
            startActivity(Intent(this, Screen14_ChatsPage::class.java));
            finish()
        }
    }
}