package com.KainatAli.i212470

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen11_DropReviewPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen11_drop_review_page)

        // 1. Backbtn_onDropReviewPage (send back to mentor info page)
        val backFromMentorReview = findViewById<Button>(R.id.Backbtn_onDropReviewPage)
        backFromMentorReview.setOnClickListener{
            startActivity(Intent(this, Screen10_MentorInfoPage::class.java));
            finish()
        }


        // 2. submitFeedbackBtn_onDropReviewPage
        val submitFeedback = findViewById<Button>(R.id.submitFeedbackBtn_onDropReviewPage)
        submitFeedback.setOnClickListener{
            startActivity(Intent(this, Screen10_MentorInfoPage::class.java));
            finish()
        }
    }
}