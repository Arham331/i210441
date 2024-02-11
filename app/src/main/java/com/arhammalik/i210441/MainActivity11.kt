package com.arhammalik.i210441

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class MainActivity11 : AppCompatActivity()
{
    private lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)
    }

    fun GoToDashboard(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity11, MainActivity5::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

    fun GoToJohnCooper(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity11, MainActivity10::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }
}