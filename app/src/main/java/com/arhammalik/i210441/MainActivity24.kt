package com.arhammalik.i210441

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity24 : AppCompatActivity()
{
    private lateinit var handler: Handler
    fun GoToDashboard(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity24, MainActivity5::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main24)

        val c1 = findViewById<ImageView>(R.id.c1)
        val c2 = findViewById<ImageView>(R.id.c2)
        val c3 = findViewById<ImageView>(R.id.c3)
        val c4 = findViewById<ImageView>(R.id.c4)
        val c5 = findViewById<ImageView>(R.id.c5)
        val clear_all = findViewById<TextView>(R.id.clear_all)

        val l1 = findViewById<LinearLayout>(R.id.notif1)
        val l2 = findViewById<LinearLayout>(R.id.notif2)
        val l3 = findViewById<LinearLayout>(R.id.notif3)
        val l4 = findViewById<LinearLayout>(R.id.notif4)
        val l5 = findViewById<LinearLayout>(R.id.notif5)

        clear_all.setOnClickListener {
            l1.visibility = View.GONE
            l2.visibility = View.GONE
            l3.visibility = View.GONE
            l4.visibility = View.GONE
            l5.visibility = View.GONE
        }
        c1.setOnClickListener {
            l1.visibility = View.GONE
        }
        c2.setOnClickListener {
            l2.visibility = View.GONE
        }
        c3.setOnClickListener {
            l3.visibility = View.GONE
        }
        c4.setOnClickListener {
            l4.visibility = View.GONE
        }
        c5.setOnClickListener {
            l5.visibility = View.GONE
        }
    }
}