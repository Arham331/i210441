package com.arhammalik.i210441

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class MainActivity16 : AppCompatActivity()
{
    private lateinit var handler: Handler

    fun GoToDashboard(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity16, MainActivity5::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

    fun GoToJohnCooperPage(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity16, MainActivity10::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

    fun GoToJohnCooperChat(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity16, MainActivity13::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

    fun GoToJohnCooperVoiceCall(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity16, MainActivity20::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

    fun GoToJohnCooperVideoCall(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity16, MainActivity19::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main16)
    }
}