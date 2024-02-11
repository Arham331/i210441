package com.arhammalik.i210441

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.arhammalik.i210441.R // Make sure to import the R file for your project

class MainActivity2 : AppCompatActivity()
{
    private lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //underline code
        val textViewSignUp = findViewById<TextView>(R.id.textViewSignUp)
        val content = SpannableString("Sign Up")
        content.setSpan(UnderlineSpan(), 0, content.length, 0)
        textViewSignUp.text = content
    }

    fun forgotPasswordFunction(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity2, MainActivity6::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

    fun loginFunction(view: View)
    {
        print("Button Pressed")
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity2, MainActivity5::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

    fun registerUserFunction(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity2, MainActivity3::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

}