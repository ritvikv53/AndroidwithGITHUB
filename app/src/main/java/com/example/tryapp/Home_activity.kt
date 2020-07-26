package com.example.tryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Home_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_activity)


        var user_name_textview : TextView = findViewById(R.id.user_name_textview) as TextView
        var btn : Button = findViewById(R.id.go_third) as Button


        var name = intent.getStringExtra("name")

        user_name_textview.text = name

        btn.setOnClickListener {

            var intent = Intent(this@Home_activity, ThirdActivity::class.java)

            startActivity(intent)
        }



    }
}