package com.KainatAli.i212470

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen12_AddNewMentor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen12_add_new_mentor)

        // 1. uploadMentorBtn_onAddNewMentorPage
        val doneAddingMentor = findViewById<Button>(R.id.uploadMentorBtn_onAddNewMentorPage)
        doneAddingMentor.setOnClickListener{
            startActivity(Intent(this, Screen7_Homepage::class.java));
            finish()
        }

        // 2. Backbtn_onAddNewMentorPage
        val backFromMentorAdd = findViewById<Button>(R.id.Backbtn_onAddNewMentorPage)
        backFromMentorAdd.setOnClickListener{
            startActivity(Intent(this, Screen7_Homepage::class.java));
            finish()
        }

        //3. Homebtn_onAddMentorPage_BottomNav
        val goHome = findViewById<Button>(R.id.Homebtn_onAddMentorPage_BottomNav)
        goHome.setOnClickListener{
            startActivity(Intent(this, Screen7_Homepage::class.java));
            finish()
        }

        //4. Searchbtn_onAddMentorPage_BottomNav
        val goSearch = findViewById<Button>(R.id.Searchbtn_onAddMentorPage_BottomNav)
        goSearch.setOnClickListener{
            startActivity(Intent(this, Screen8_Searching::class.java));
            finish()
        }

        //5. Chatbtn_onAddMentorPage_bottomNav
        //6. Profilebtn_onAddMentorPage_bottomNav
    }
}