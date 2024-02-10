package com.arhammalik.i210441

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.view.View
import android.widget.TextView

class MainActivity6 : AppCompatActivity()
{
    private lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val textViewSignUp = findViewById<TextView>(R.id.textViewLogin)
        val content = SpannableString("Log In")
        content.setSpan(UnderlineSpan(), 0, content.length, 0)
        textViewSignUp.text = content
    }

    fun BackToLoginPage(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity6, MainActivity2::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

    fun GoToRestPassword(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity6, MainActivity7::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

}