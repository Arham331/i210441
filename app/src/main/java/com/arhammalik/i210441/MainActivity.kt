package com.arhammalik.i210441

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.os.Handler


class MainActivity : AppCompatActivity()
{
    private lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity, MainActivity2::class.java)
                startActivity(intent)
                finish()
            }, 3000)
    }
}