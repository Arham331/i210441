package com.arhammalik.i210441

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class MainActivity10 : AppCompatActivity()
{
    private lateinit var handler: Handler
    fun GoToDashboard(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity10, MainActivity5::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

    fun GoToReviewPage(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity10, MainActivity11::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

    fun GoToCommunityPage(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity10, MainActivity17::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

    fun GoToBookSessionPage(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity10, MainActivity16::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)
    }
}