package com.KainatAli.i212470

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Screen14_ChatsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen14_chats_page)

        //1. backBtn_onChatsPage
        val goBackToHome = findViewById<Button>(R.id.backBtn_onChatsPage)
        goBackToHome.setOnClickListener{
            startActivity(Intent(this, Screen7_Homepage::class.java));
            finish()
        }

        //2. openJohnsChat_onChatsPage
        val openJ = findViewById<Button>(R.id.openJohnsChat_onChatsPage)
        openJ.setOnClickListener{
            startActivity(Intent(this, Screen15_JohnCooperChat::class.java));
            finish()
        }

        //3. Homebtn_onChatsPage_BottomNav
        val goH = findViewById<Button>(R.id.Homebtn_onChatsPage_BottomNav)
        goH.setOnClickListener{
            startActivity(Intent(this, Screen7_Homepage::class.java));
            finish()
        }

        //4. Searchbtn_onChatsPage_BottomNav
        val goSearchPage = findViewById<Button>(R.id.Searchbtn_onChatsPage_BottomNav)
        goSearchPage.setOnClickListener{
            startActivity(Intent(this, Screen8_Searching::class.java));
            finish()
        }

        //5. Plusbtn_onChatsPage
        val goAdd = findViewById<Button>(R.id.Plusbtn_onChatsPage)
        goAdd.setOnClickListener{
            startActivity(Intent(this, Screen12_AddNewMentor::class.java));
            finish()
        }

        //7. Profilebtn_onChatsPage_bottomNav
        val profi = findViewById<Button>(R.id.Profilebtn_onChatsPage_bottomNav)
        profi.setOnClickListener{
            startActivity(Intent(this, Screen21_Profile::class.java));
            finish()
        }
    }
}