package com.example.firstappgood

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text

class thirdActivity : AppCompatActivity() {

    private lateinit var TextView: TextView
    private lateinit var myObserver: MyObserver

    private val status = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        TextView = findViewById(R.id.textView2)
        myObserver = MyObserver()
        lifecycle.addObserver(myObserver)
//        show("on create")
    }

//    @SuppressLint("SetTextI18n")
//    fun show(message: String) {
//        status += "${lifecycle.currentState}, $message"
//        TextView.text = status.joinToString("\n")
//    }
//
//    override fun onStart() {
//        super.onStart()
//        show("on start")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        show("on resume")
//    }
//
//    override fun onPostResume() {
//        super.onPostResume()
//        show("on post resume")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        show("on pause")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        show("on stop")
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        show("on restart")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        show("on destroy")
//    }
}