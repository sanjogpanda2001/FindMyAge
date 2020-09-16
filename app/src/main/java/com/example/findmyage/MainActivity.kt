package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
button.setOnClickListener{
   btnclc()
}
    }

    fun btnclc() {
        if (editTextDate.text.toString().isEmpty()) {

            Toast.makeText(this@MainActivity, "enter year of birth" , Toast.LENGTH_SHORT).show()
        } else {
            val userDOB = Integer.parseInt(editTextDate.text.toString())
            //val cuYear=Calendar.YEAR

            val cuYear = Calendar.getInstance().get(Calendar.YEAR)
            val userage = cuYear - userDOB
            textView.text = "Your age is $userage Years"
        }
    }
}