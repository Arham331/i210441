package com.arhammalik.i210441

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity17 : AppCompatActivity()
{
    private lateinit var handler: Handler
    fun GoToJohnCooperPage(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity17, MainActivity10::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main17)

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
        chatpic.setImageResource(R.drawable.chat_icon_selected)
        profilepic.setImageResource(R.drawable.profile_icon_not_selected)

        //Navigation to DASHBOARD if clicked
        homepic.setOnClickListener {
            handler = Handler()
            handler.postDelayed(
                {
                    val intent = Intent(this@MainActivity17, MainActivity5::class.java)
                    startActivity(intent)
                    finish()
                }, 0)
        }
        home.setOnClickListener {
            handler = Handler()
            handler.postDelayed(
                {
                    val intent = Intent(this@MainActivity17, MainActivity5::class.java)
                    startActivity(intent)
                    finish()
                }, 0)
        }

        //Navigation to SEARCH if clicked
        searchpic.setOnClickListener {
            handler = Handler()
            handler.postDelayed(
                {
                    val intent = Intent(this@MainActivity17, MainActivity8::class.java)
                    startActivity(intent)
                    finish()
                }, 0)
        }
        search.setOnClickListener {
            handler = Handler()
            handler.postDelayed(
                {
                    val intent = Intent(this@MainActivity17, MainActivity8::class.java)
                    startActivity(intent)
                    finish()
                }, 0)
        }

        //Navigation to CHATS if clicked
        chatpic.setOnClickListener {
            handler = Handler()
            handler.postDelayed(
                {
                    val intent = Intent(this@MainActivity17, MainActivity14::class.java)
                    startActivity(intent)
                    finish()
                }, 0)
        }
        chat.setOnClickListener {
            handler = Handler()
            handler.postDelayed(
                {
                    val intent = Intent(this@MainActivity17, MainActivity14::class.java)
                    startActivity(intent)
                    finish()
                }, 0)
        }

        //Navigation to PROFILE if clicked
        profilepic.setOnClickListener {
            handler = Handler()
            handler.postDelayed(
                {
                    val intent = Intent(this@MainActivity17, MainActivity21::class.java)
                    startActivity(intent)
                    finish()
                }, 0)
        }
        profile.setOnClickListener {
            handler = Handler()
            handler.postDelayed(
                {
                    val intent = Intent(this@MainActivity17, MainActivity21::class.java)
                    startActivity(intent)
                    finish()
                }, 0)
        }

        home.setTextColor(ContextCompat.getColor(this, R.color.FontShadeDark))
        search.setTextColor(ContextCompat.getColor(this, R.color.FontShadeDark))
        chat.setTextColor(ContextCompat.getColor(this, R.color.FontShadeLight))
        profile.setTextColor(ContextCompat.getColor(this, R.color.FontShadeDark))

    }
}