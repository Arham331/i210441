package com.arhammalik.i210441

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat

class MainActivity8 : AppCompatActivity()
{
    private lateinit var handler: Handler
    private lateinit var editText: EditText
    private fun navigateToSearchPage()
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity8, MainActivity9::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

    fun BecomeMentorPage(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity8, MainActivity12::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

    fun GoToDashboard(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity8, MainActivity5::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

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
        searchpic.setImageResource(R.drawable.search_icon_selected)
        chatpic.setImageResource(R.drawable.chat_icon_not_selected)
        profilepic.setImageResource(R.drawable.profile_icon_not_selected)

        //Navigation to DASHBOARD if clicked
        homepic.setOnClickListener {
            handler = Handler()
            handler.postDelayed(
                {
                    val intent = Intent(this@MainActivity8, MainActivity5::class.java)
                    startActivity(intent)
                    finish()
                }, 0)
        }
        home.setOnClickListener {
            handler = Handler()
            handler.postDelayed(
                {
                    val intent = Intent(this@MainActivity8, MainActivity5::class.java)
                    startActivity(intent)
                    finish()
                }, 0)
        }

        //Navigation to SEARCH if clicked
        searchpic.setOnClickListener {
            handler = Handler()
            handler.postDelayed(
                {
                    val intent = Intent(this@MainActivity8, MainActivity8::class.java)
                    startActivity(intent)
                    finish()
                }, 0)
        }
        search.setOnClickListener {
            handler = Handler()
            handler.postDelayed(
                {
                    val intent = Intent(this@MainActivity8, MainActivity8::class.java)
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

        home.setTextColor(ContextCompat.getColor(this, R.color.FontShadeDark))
        search.setTextColor(ContextCompat.getColor(this, R.color.FontShadeLight))
        //plus.setTextColor(ContextCompat.getColor(this, R.color.FontShadeDark))
        chat.setTextColor(ContextCompat.getColor(this, R.color.FontShadeDark))
        profile.setTextColor(ContextCompat.getColor(this, R.color.FontShadeDark))

        val c1 = findViewById<ImageView>(R.id.cross1)
        val c2 = findViewById<ImageView>(R.id.cross2)
        val c3 = findViewById<ImageView>(R.id.cross3)

        val l1 = findViewById<LinearLayout>(R.id.linearLayout2)
        val l2 = findViewById<LinearLayout>(R.id.linearLayout3)
        val l3 = findViewById<LinearLayout>(R.id.linearLayout4)
        c1.setOnClickListener {
            l1.visibility = View.GONE
        }
        c2.setOnClickListener {
            l2.visibility = View.GONE
        }
        c3.setOnClickListener {
            l3.visibility = View.GONE
        }

        editText = findViewById(R.id.editText2)
        editText.setOnEditorActionListener { _, actionId, event ->
            if (actionId == EditorInfo.IME_ACTION_DONE ||
                (event != null && event.keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_DOWN)
            )
            {
                navigateToSearchPage()
                return@setOnEditorActionListener true
            }
            return@setOnEditorActionListener false
        }


    }
}