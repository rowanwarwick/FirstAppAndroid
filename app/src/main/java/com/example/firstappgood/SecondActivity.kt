package com.example.firstappgood

import android.icu.text.AlphabeticIndex.Bucket.LabelType
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlin.random.Random

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = ""
    }

    private lateinit var textViewRandom: TextView
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second )
        textViewRandom = findViewById(R.id.textViewRandom)
        textView = findViewById(R.id.textView)
        showNumber()
    }

    fun showNumber() {
        val count = intent.getIntExtra(TOTAL_COUNT, 0)
        var random = 0
        if (count > 0) {
            random = Random.nextInt(count + 1)
        }
        textViewRandom.text = random.toString()
        textView.text = getString(R.string.random_heading, count)
    }
}