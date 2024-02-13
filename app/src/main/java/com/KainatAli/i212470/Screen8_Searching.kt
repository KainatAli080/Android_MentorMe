package com.KainatAli.i212470

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen8_Searching : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen8_searching)

        // Buttons to implement:
        // 1. searchBtn_onSearchBar_searchPage
        // 3. Profilebtn_onSearchPage_bottomNav
        // 4. Chatbtn_onSearchPage_bottomNav
        // 5. Plusbtn_onSearchPage_bottomNav

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
//        val redirectToChatPage = findViewById<Button>(R.id.Chatbtn_onHomePage)
//        redirectToChatPage.setOnClickListener{
//            startActivity(Intent(this, Screen8_Searching::class.java));
//            finish()
//        }

        // Redirecting to Profile Page
//        val redirectToProfilePage = findViewById<Button>(R.id.Profilebtn_onHomePage)
//        redirectToProfilePage.setOnClickListener{
//            startActivity(Intent(this, Screen8_Searching::class.java));
//            finish()
//        }

        // Redirect to Add mentor page, the plus button
//        val redirectToAddMentor = findViewById<Button>(R.id.Plusbtn_onHomePage)
//        redirectToAddMentor.setOnClickListener{
//            startActivity(Intent(this, Screen8_Searching::class.java));
//            finish()
//        }

        // Redirecting to Notifications Page
//        val redirectToNotifications = findViewById<Button>(R.id.notificationbtn_onHomePage)
//        redirectToNotifications.setOnClickListener{
//            startActivity(Intent(this, Screen8_Searching::class.java));
//            finish()
//        }
    }
}