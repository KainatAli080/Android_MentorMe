package com.KainatAli.i212470

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen10_MentorInfoPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen10_mentor_info_page)

        // 1. dropReviewBtn_onMentorInfoPage
        // 2. joinCommunityBtn_onMentorInfoPage
        // 3. bookSessionBtn_onMentorInfoPage


        // 4. Backbtn_onMentorInfoPage
        val backFromMentorInfo = findViewById<Button>(R.id.Backbtn_onMentorInfoPage)
        backFromMentorInfo.setOnClickListener{
            startActivity(Intent(this, Screen9_SearchResultsPage::class.java));
            finish()
        }
    }
}