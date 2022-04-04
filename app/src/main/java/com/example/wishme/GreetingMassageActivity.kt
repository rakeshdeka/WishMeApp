package com.example.wishme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_greeting_massage.*

class GreetingMassageActivity : AppCompatActivity() {
    companion object{
        const val NAME_Extra="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting_massage)
        val name = intent.getStringExtra(NAME_Extra)
       birthdayGreeting.text = "Happy Birthday\n$name"
    }
}