package com.KainatAli.i212470

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen9_SearchResultsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen9_search_results_page)

        // 2. Backbtn_onSearchResultsPage
        val goBackToSearch = findViewById<Button>(R.id.Backbtn_onSearchResultsPage)
        goBackToSearch.setOnClickListener{
            startActivity(Intent(this, Screen8_Searching::class.java));
            finish()
        }

        // 3. Homebtn_onSearchResultsPage
        val goBackHome = findViewById<Button>(R.id.Homebtn_onSearchResultsPage)
        goBackHome.setOnClickListener{
            startActivity(Intent(this, Screen7_Homepage::class.java));
            finish()
        }

        // 4. SearchPagebtn_onSearchResultsPage_bottomNav
        val goBack = findViewById<Button>(R.id.SearchPagebtn_onSearchResultsPage_bottomNav)
        goBack.setOnClickListener{
            startActivity(Intent(this, Screen8_Searching::class.java));
            finish()
        }

        // 1. MentorInfoBtn_onSearchResultsPage (would redirect to mentor info page)
        val mentInfo = findViewById<Button>(R.id.MentorInfoBtn_onSearchResultsPage)
        mentInfo.setOnClickListener{
            startActivity(Intent(this, Screen10_MentorInfoPage::class.java));
            finish()
        }

        // 5. Plusbtn_onSearchResultsPage_bottomNav
        val new = findViewById<Button>(R.id.Plusbtn_onSearchResultsPage_bottomNav)
        new.setOnClickListener{
            startActivity(Intent(this, Screen12_AddNewMentor::class.java));
            finish()
        }

        // 6. Chatbtn_onSearchResultsPage_bottomNav
        val chat = findViewById<Button>(R.id.Chatbtn_onSearchResultsPage_bottomNav)
        chat.setOnClickListener{
            startActivity(Intent(this, Screen14_ChatsPage::class.java));
            finish()
        }

        // 7. Profilebtn_onSearchResultsPage_bottomNav
        val prof = findViewById<Button>(R.id.Profilebtn_onSearchResultsPage_bottomNav)
        prof.setOnClickListener{
            startActivity(Intent(this, Screen21_Profile::class.java));
            finish()
        }
    }
}