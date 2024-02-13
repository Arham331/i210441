package com.arhammalik.i210441

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class MainActivity15 : AppCompatActivity()
{
    private lateinit var handler: Handler

    fun GoToJohnCooperChat(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity15, MainActivity13::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

    fun OpenVideo(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity15, MainActivity18::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main15)
    }
}