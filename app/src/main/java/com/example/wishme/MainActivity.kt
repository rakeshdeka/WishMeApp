package com.example.wishme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun Button(view: View) {


        val name = nameInput.editableText.toString()
        val intent = Intent(this, GreetingMassageActivity::class.java)
        intent.putExtra(GreetingMassageActivity.NAME_Extra,name)
        startActivity(intent)

    }


}
