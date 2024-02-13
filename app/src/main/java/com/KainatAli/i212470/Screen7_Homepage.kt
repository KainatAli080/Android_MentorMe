package com.KainatAli.i212470

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Screen7_Homepage : AppCompatActivity() {

    private lateinit var displayName:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen7_homepage)

        // to display the name of user
        // retrieve the name of user associated with the email entered
        displayName = findViewById<TextView>(R.id.displayName)
        val intent = intent
        val name = intent.getStringExtra(Screen2_Login.PASS_NAME)
        displayName.text = name.toString()

        //Already on homePage so no home Button functionality

        // Redirecting to Search Page for searching
        val redirectToSearching = findViewById<Button>(R.id.Searchbtn_onHomePage_BottomNav)
        redirectToSearching.setOnClickListener{
            startActivity(Intent(this, Screen8_Searching::class.java));
            finish()
        }

        // Redirecting to Chat Page
        val redirectToChatPage = findViewById<Button>(R.id.Chatbtn_onHomePage_bottomNav)
        redirectToChatPage.setOnClickListener{
            startActivity(Intent(this, Screen14_ChatsPage::class.java));
            finish()
        }

        // Redirecting to Profile Page
        val redirectToProfilePage = findViewById<Button>(R.id.Profilebtn_onHomePage_bottomNav)
        redirectToProfilePage.setOnClickListener{
            startActivity(Intent(this, Screen21_Profile::class.java));
            finish()
        }

        // Redirect to Add mentor page, the plus button
        val redirectToAddMentor = findViewById<Button>(R.id.Plusbtn_onHomePage_bottomNav)
        redirectToAddMentor.setOnClickListener{
            startActivity(Intent(this, Screen12_AddNewMentor::class.java));
            finish()
        }

        // Redirecting to Notifications Page
        val redirectToNotifications = findViewById<Button>(R.id.notificationBtn_onHomePage)
        redirectToNotifications.setOnClickListener{
            startActivity(Intent(this, Screen24_NotificationsPage::class.java));
            finish()
        }

    }
}