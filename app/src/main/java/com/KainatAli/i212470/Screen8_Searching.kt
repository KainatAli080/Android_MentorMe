package com.KainatAli.i212470

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen8_Searching : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen8_searching)

        // Redirecting to Home Page for back button
        val goBackToHome = findViewById<Button>(R.id.Backbtn_onSearchingPage)
        goBackToHome.setOnClickListener{
            startActivity(Intent(this, Screen7_Homepage::class.java));
            finish()
        }

        //Already on SearchPage so no home Button functionality

        // Redirecting to Search Page for searching
        val redirectToHome = findViewById<Button>(R.id.Homebtn_onSearchPage_BottomNav)
        redirectToHome.setOnClickListener{
            startActivity(Intent(this, Screen7_Homepage::class.java));
            finish()
        }


        // Redirecting to Chat Page
        val ToChatPage = findViewById<Button>(R.id.Chatbtn_onSearchPage_bottomNav)
        ToChatPage.setOnClickListener{
            startActivity(Intent(this, Screen14_ChatsPage::class.java));
            finish()
        }

        // Redirecting to Profile Page
        val ToProfilePage = findViewById<Button>(R.id.Profilebtn_onSearchPage_bottomNav)
        ToProfilePage.setOnClickListener{
            startActivity(Intent(this, Screen21_Profile::class.java));
            finish()
        }

        // Redirect to Add mentor page, the plus button
        val ToAddMentor = findViewById<Button>(R.id.Plusbtn_onSearchPage_bottomNav)
        ToAddMentor.setOnClickListener{
            startActivity(Intent(this, Screen12_AddNewMentor::class.java));
            finish()
        }

        // Redirecting to SearchResults Page
        val searchResults = findViewById<Button>(R.id.searchBtn_onSearchBar_searchPage)
        searchResults.setOnClickListener{
            startActivity(Intent(this, Screen9_SearchResultsPage::class.java));
            finish()
        }
    }
}