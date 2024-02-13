package com.KainatAli.i212470

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen15_JohnCooperChat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen15_john_cooper_chat)

        //1. backBtn_onJohnCoopersChat
        val goToChats = findViewById<Button>(R.id.backBtn_onJohnCoopersChat)
        goToChats.setOnClickListener{
            startActivity(Intent(this, Screen14_ChatsPage::class.java));
            finish()
        }

        //2. callBtn_onJohnCoopersChat
        val startVoiceCall = findViewById<Button>(R.id.callBtn_onJohnCoopersChat)
        startVoiceCall.setOnClickListener{
            startActivity(Intent(this, Screen20_VoiceCall::class.java));
            finish()
        }

        //3. videoCallBtn_onJohnCoopersChat
        val startVideoCall = findViewById<Button>(R.id.videoCallBtn_onJohnCoopersChat)
        startVideoCall.setOnClickListener{
            startActivity(Intent(this, Screen19_VideoCall::class.java));
            finish()
        }

        //4. Homebtn_onJohnsChat_BottomNav
        val goToHomePage = findViewById<Button>(R.id.Homebtn_onJohnsChat_BottomNav)
        goToHomePage.setOnClickListener{
            startActivity(Intent(this, Screen7_Homepage::class.java));
            finish()
        }
        //5. Searchbtn_onJohnsChat_BottomNav
        val goToSearch = findViewById<Button>(R.id.Searchbtn_onJohnsChat_BottomNav)
        goToSearch.setOnClickListener{
            startActivity(Intent(this, Screen8_Searching::class.java));
            finish()
        }
        //6. Plusbtn_onJohnsChat_bottomNav
        val addNew = findViewById<Button>(R.id.Plusbtn_onJohnsChat_bottomNav)
        addNew.setOnClickListener{
            startActivity(Intent(this, Screen12_AddNewMentor::class.java));
            finish()
        }
        //7. Chatbtn_onJohnsChat_bottomNav
        val goToChat = findViewById<Button>(R.id.Chatbtn_onJohnsChat_bottomNav)
        goToChat.setOnClickListener{
            startActivity(Intent(this, Screen14_ChatsPage::class.java));
            finish()
        }




        //8. Profilebtn_onJohnsChat_bottomNav
    }
}