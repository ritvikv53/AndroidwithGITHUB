package com.example.tryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //fetch all views

        var user_name : EditText = findViewById(R.id.user_name) as EditText
        var btn : Button = findViewById(R.id.go) as Button

        btn.setOnClickListener {
            var name : String = user_name.text.toString()

       var intent = Intent( this@MainActivity, Home_activity :: class.java)
            intent.putExtra("name", name)
            startActivity(intent)




        }

    }
}