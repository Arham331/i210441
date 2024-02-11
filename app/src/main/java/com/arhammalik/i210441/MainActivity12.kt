package com.arhammalik.i210441

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity12 : AppCompatActivity()
{
    private lateinit var handler: Handler

    fun BecomeMentorPage(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity12, MainActivity12::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

    fun GoToDashboard (view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity12, MainActivity5::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12)

        val home: TextView = findViewById(R.id.home_text)
        val search: TextView = findViewById(R.id.search_text)
        val plus: LinearLayout = findViewById(R.id.plusButton)
        val chat: TextView = findViewById(R.id.chat_text)
        val profile: TextView = findViewById(R.id.profile_text)

        val homepic = findViewById<ImageView>(R.id.home_png)
        val searchpic = findViewById<ImageView>(R.id.search_png)
        val chatpic = findViewById<ImageView>(R.id.chat_png)
        val profilepic = findViewById<ImageView>(R.id.profile_png)

        homepic.setImageResource(R.drawable.home_icon_not_selected)
        searchpic.setImageResource(R.drawable.search_icon_not_selected)
        chatpic.setImageResource(R.drawable.chat_icon_not_selected)
        profilepic.setImageResource(R.drawable.profile_icon_not_selected)
    }
}