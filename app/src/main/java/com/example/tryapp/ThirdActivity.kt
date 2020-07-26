package com.example.tryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        var btn : Button = findViewById(R.id.go_back) as Button

        btn.setOnClickListener {

            var intent = Intent( this@ThirdActivity, MainActivity::class.java)
            startActivity(intent)

        }



    }
}