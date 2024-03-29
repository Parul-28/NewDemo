package com.example.newdemo

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }



    fun countMe (view: View) {
        val showCountTextView = findViewById<TextView>(R.id.textView)
        val countString = showCountTextView.text.toString()

        // Convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++
        showCountTextView.text = count.toString();

    }


    fun randomMe (view: View) {
        // Create an Intent to start the second activity
        val randomIntent = Intent(this, SecondAct::class.java)

        // Get the current value of the text view.
        val countString = textView.text.toString()

        // Convert the count to an int
        val count = Integer.parseInt(countString)

        // Add the count to the extras for the Intent.
        randomIntent.putExtra(SecondAct.TOTAL_COUNT, count)

        // Start the new activity.
        startActivity(randomIntent)
    }

//    fun randomFun(view: View){
//
//        val randomIntent = Intent(this, SecondAct::class.java)
//
//// Start the new activity.
//        startActivity(randomIntent)
//    }


}

