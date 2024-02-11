package com.arhammalik.i210441

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity5 : AppCompatActivity()
{
    private lateinit var handler: Handler

    fun BecomeMentorPage(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity5, MainActivity12::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

    fun GoToJohnCooper(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity5, MainActivity10::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)



        //using buttons to set colors of selected and unselected buttons
        val all: Button = findViewById(R.id.all)
        val education: Button = findViewById(R.id.education)
        val entrepreneurship: Button = findViewById(R.id.entrepreneurship)
        val growth: Button = findViewById(R.id.growth)
        val career: Button = findViewById(R.id.Career)

        //default colors when page loads
        all.setBackgroundColor(ContextCompat.getColor(this, R.color.Dark))
        all.setTextColor(ContextCompat.getColor(this, R.color.white))

        education.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
        education.setTextColor(ContextCompat.getColor(this, R.color.Dark))

        entrepreneurship.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
        entrepreneurship.setTextColor(ContextCompat.getColor(this, R.color.Dark))

        growth.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
        growth.setTextColor(ContextCompat.getColor(this, R.color.Dark))

        career.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
        career.setTextColor(ContextCompat.getColor(this, R.color.Dark))

        //when ALL is selected
        all.setOnClickListener{
            all.setBackgroundColor(ContextCompat.getColor(this, R.color.Dark))
            all.setTextColor(ContextCompat.getColor(this, R.color.white))

            education.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
            education.setTextColor(ContextCompat.getColor(this, R.color.Dark))

            entrepreneurship.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
            entrepreneurship.setTextColor(ContextCompat.getColor(this, R.color.Dark))

            growth.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
            growth.setTextColor(ContextCompat.getColor(this, R.color.Dark))

            career.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
            career.setTextColor(ContextCompat.getColor(this, R.color.Dark))
        }
        //when EDUCATION is selected ...and so on
        education.setOnClickListener{
            all.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
            all.setTextColor(ContextCompat.getColor(this, R.color.Dark))

            education.setBackgroundColor(ContextCompat.getColor(this, R.color.Dark))
            education.setTextColor(ContextCompat.getColor(this, R.color.white))

            entrepreneurship.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
            entrepreneurship.setTextColor(ContextCompat.getColor(this, R.color.Dark))

            growth.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
            growth.setTextColor(ContextCompat.getColor(this, R.color.Dark))

            career.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
            career.setTextColor(ContextCompat.getColor(this, R.color.Dark))
        }

        entrepreneurship.setOnClickListener{
            all.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
            all.setTextColor(ContextCompat.getColor(this, R.color.Dark))

            education.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
            education.setTextColor(ContextCompat.getColor(this, R.color.Dark))

            entrepreneurship.setBackgroundColor(ContextCompat.getColor(this, R.color.Dark))
            entrepreneurship.setTextColor(ContextCompat.getColor(this, R.color.white))

            growth.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
            growth.setTextColor(ContextCompat.getColor(this, R.color.Dark))

            career.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
            career.setTextColor(ContextCompat.getColor(this, R.color.Dark))
        }

        growth.setOnClickListener{
            all.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
            all.setTextColor(ContextCompat.getColor(this, R.color.Dark))

            education.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
            education.setTextColor(ContextCompat.getColor(this, R.color.Dark))

            entrepreneurship.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
            entrepreneurship.setTextColor(ContextCompat.getColor(this, R.color.Dark))

            growth.setBackgroundColor(ContextCompat.getColor(this, R.color.Dark))
            growth.setTextColor(ContextCompat.getColor(this, R.color.white))

            career.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
            career.setTextColor(ContextCompat.getColor(this, R.color.Dark))
        }

        career.setOnClickListener{
            all.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
            all.setTextColor(ContextCompat.getColor(this, R.color.Dark))

            education.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
            education.setTextColor(ContextCompat.getColor(this, R.color.Dark))

            entrepreneurship.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
            entrepreneurship.setTextColor(ContextCompat.getColor(this, R.color.Dark))

            growth.setBackgroundColor(ContextCompat.getColor(this, R.color.Light))
            growth.setTextColor(ContextCompat.getColor(this, R.color.Dark))

            career.setBackgroundColor(ContextCompat.getColor(this, R.color.Dark))
            career.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        //ribbon buttons
        val home: TextView = findViewById(R.id.home_text)
        val search: TextView = findViewById(R.id.search_text)
        val chat: TextView = findViewById(R.id.chat_text)
        val profile: TextView = findViewById(R.id.profile_text)

        val homepic = findViewById<ImageView>(R.id.home_png)
        val searchpic = findViewById<ImageView>(R.id.search_png)
        val chatpic = findViewById<ImageView>(R.id.chat_png)
        val profilepic = findViewById<ImageView>(R.id.profile_png)

        homepic.setImageResource(R.drawable.home_icon_selected)
        searchpic.setImageResource(R.drawable.search_icon_not_selected)
        chatpic.setImageResource(R.drawable.chat_icon_not_selected)
        profilepic.setImageResource(R.drawable.profile_icon_not_selected)

        home.setTextColor(ContextCompat.getColor(this, R.color.FontShadeLight))
        search.setTextColor(ContextCompat.getColor(this, R.color.FontShadeDark))
        chat.setTextColor(ContextCompat.getColor(this, R.color.FontShadeDark))
        profile.setTextColor(ContextCompat.getColor(this, R.color.FontShadeDark))

        //Navigation to DASHBOARD if clicked
        homepic.setOnClickListener {
            handler = Handler()
            handler.postDelayed(
                {
                    val intent = Intent(this@MainActivity5, MainActivity5::class.java)
                    startActivity(intent)
                    finish()
                }, 0)
        }
        home.setOnClickListener {
            handler = Handler()
            handler.postDelayed(
                {
                    val intent = Intent(this@MainActivity5, MainActivity5::class.java)
                    startActivity(intent)
                    finish()
                }, 0)
        }

        //Navigation to SEARCH if clicked
        searchpic.setOnClickListener {
            handler = Handler()
            handler.postDelayed(
                {
                    val intent = Intent(this@MainActivity5, MainActivity8::class.java)
                    startActivity(intent)
                    finish()
                }, 0)
        }
        search.setOnClickListener {
            handler = Handler()
            handler.postDelayed(
                {
                    val intent = Intent(this@MainActivity5, MainActivity8::class.java)
                    startActivity(intent)
                    finish()
                }, 0)
        }

        //Navigation to CHATS if clicked
        chatpic.setOnClickListener {

        }
        chat.setOnClickListener {

        }

        //Navigation to PROFILE if clicked
        profilepic.setOnClickListener {

        }
        profile.setOnClickListener {

        }
    }
}