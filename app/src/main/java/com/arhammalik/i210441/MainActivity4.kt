package com.arhammalik.i210441

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale
import android.widget.ImageView


class MainActivity4 : AppCompatActivity()
{
    private lateinit var handler: Handler
    private var countDownTimer: CountDownTimer? = null
    private var timerTextView: TextView? = null
    private var timeLeftInMillis: Long = 30000 // 30 seconds
    private lateinit var noCircles: Array<ImageView>
    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        //Timer
        timerTextView = findViewById(R.id.timerTextView);
        startTimer();

        //stuff that appears in those small circles
        noCircles = arrayOf( findViewById(R.id.C1), findViewById(R.id.C2), findViewById(R.id.C3), findViewById(R.id.C4), findViewById(R.id.C5)
        )

        findViewById<Button>(R.id.button0).setOnClickListener { updateNumber("0") }
        findViewById<Button>(R.id.button1).setOnClickListener { updateNumber("1") }
        findViewById<Button>(R.id.button2).setOnClickListener { updateNumber("2") }
        findViewById<Button>(R.id.button3).setOnClickListener { updateNumber("3") }
        findViewById<Button>(R.id.button4).setOnClickListener { updateNumber("4") }
        findViewById<Button>(R.id.button5).setOnClickListener { updateNumber("5") }
        findViewById<Button>(R.id.button6).setOnClickListener { updateNumber("6") }
        findViewById<Button>(R.id.button7).setOnClickListener { updateNumber("7") }
        findViewById<Button>(R.id.button8).setOnClickListener { updateNumber("8") }
        findViewById<Button>(R.id.button9).setOnClickListener { updateNumber("9") }
        findViewById<ImageView>(R.id.delete).setOnClickListener { deleteNumber() }
    }

    private fun updateNumber(n: String)
    {
        if(index < noCircles.size)
        {
            noCircles[index].setImageResource(getNumberDrawable(n))
            index += 1
        }
    }

    private fun deleteNumber()
    {
        if(index > 0)
        {
            index -= 1;
            noCircles[index].setImageResource(R.drawable.circle_empty)
        }
    }

    private fun getNumberDrawable(n: String): Int
    {
        return when (n)
        {
            "0" -> R.drawable.number_0
            "1" -> R.drawable.number_0
            "2" -> R.drawable.number_0
            "3" -> R.drawable.number_0
            "4" -> R.drawable.number_0
            "5" -> R.drawable.number_0
            "6" -> R.drawable.number_0
            "7" -> R.drawable.number_0
            "8" -> R.drawable.number_0
            "9" -> R.drawable.number_0
            else -> R.drawable.circle_empty
        }
    }

    private fun startTimer()
    {
        countDownTimer = object : CountDownTimer(timeLeftInMillis, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                timeLeftInMillis = millisUntilFinished
                updateCountdownText()
            }

            override fun onFinish()
            {
                // Timer expires, restart the timer
                timeLeftInMillis = 30000 // Reset time to 30 seconds
                startTimer() // Restart the timer
            }
        }.start()
    }

    private fun updateCountdownText()
    {
        val seconds = (timeLeftInMillis / 1000).toInt() % 60
        val minutes = (timeLeftInMillis / (1000 * 60) % 60).toInt()
        val timeFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds)
        timerTextView!!.text = timeFormatted
    }


    fun GoToDashboard(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity4, MainActivity5::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }

    fun ToRegistratioPage(view: View)
    {
        handler = Handler()
        handler.postDelayed(
            {
                val intent = Intent(this@MainActivity4, MainActivity3::class.java)
                startActivity(intent)
                finish()
            }, 0)
    }
}