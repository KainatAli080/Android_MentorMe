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
        val rev = findViewById<Button>(R.id.dropReviewBtn_onMentorInfoPage)
        rev.setOnClickListener{
            startActivity(Intent(this, Screen11_DropReviewPage::class.java));
            finish()
        }

        // 2. joinCommunityBtn_onMentorInfoPage
        val join = findViewById<Button>(R.id.joinCommunityBtn_onMentorInfoPage)
        join.setOnClickListener{
            startActivity(Intent(this, Screen16_JohnsCommunity::class.java));
            finish()
        }

        // 3. bookSessionBtn_onMentorInfoPage
        val book = findViewById<Button>(R.id.bookSessionBtn_onMentorInfoPage)
        book.setOnClickListener{
            startActivity(Intent(this, Screen13_BookSession::class.java));
            finish()
        }


        // 4. Backbtn_onMentorInfoPage
        val backFromMentorInfo = findViewById<Button>(R.id.Backbtn_onMentorInfoPage)
        backFromMentorInfo.setOnClickListener{
            startActivity(Intent(this, Screen9_SearchResultsPage::class.java));
            finish()
        }
    }
}