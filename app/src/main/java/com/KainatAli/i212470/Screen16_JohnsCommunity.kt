package com.KainatAli.i212470

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen16_JohnsCommunity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen16_johns_community)

        //1. backBtn_onJohnCoopersCommunity
        val mentorIn = findViewById<Button>(R.id.backBtn_onJohnCoopersCommunity)
        mentorIn.setOnClickListener{
            startActivity(Intent(this, Screen10_MentorInfoPage::class.java));
            finish()
        }
        //2. callBtn_onJohnCoopersCommunity
        val call = findViewById<Button>(R.id.callBtn_onJohnCoopersCommunity)
        call.setOnClickListener{
            startActivity(Intent(this, Screen20_VoiceCall::class.java));
            finish()
        }
        //3. videoCallBtn_onJohnCoopersCommunity
        val video = findViewById<Button>(R.id.videoCallBtn_onJohnCoopersCommunity)
        video.setOnClickListener{
            startActivity(Intent(this, Screen19_VideoCall::class.java));
            finish()
        }


        // BOTTOM NAVIGATION INTENTS

        //4. Homebtn_onJohnsCommunity_BottomNav
        val home = findViewById<Button>(R.id.Homebtn_onJohnsCommunity_BottomNav)
        home.setOnClickListener{
            startActivity(Intent(this, Screen7_Homepage::class.java));
            finish()
        }
        //5. Searchbtn_onJohnsCommunity_BottomNav
        val search = findViewById<Button>(R.id.Searchbtn_onJohnsCommunity_BottomNav)
        search.setOnClickListener{
            startActivity(Intent(this, Screen8_Searching::class.java));
            finish()
        }
        //6. Plusbtn_onJohnsCommunity_bottomNav
        val add = findViewById<Button>(R.id.Plusbtn_onJohnsCommunity_bottomNav)
        add.setOnClickListener{
            startActivity(Intent(this, Screen12_AddNewMentor::class.java));
            finish()
        }
        //7. Chatbtn_onJohnsCommunity_bottomNav
        val chat = findViewById<Button>(R.id.Chatbtn_onJohnsCommunity_bottomNav)
        chat.setOnClickListener{
            startActivity(Intent(this, Screen14_ChatsPage::class.java));
            finish()
        }



        //8. Profilebtn_onJohnsCommunity_bottomNav
    }
}