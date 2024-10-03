package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var genderTitle: Spinner
    lateinit var name: EditText
    lateinit var address: EditText
    lateinit var code: EditText
    lateinit var number: EditText
    lateinit var login: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        genderTitle = findViewById(R.id.gender_title)
        name = findViewById(R.id.name)
        address = findViewById(R.id.address)
        code = findViewById(R.id.code)
        number = findViewById(R.id.number)
        login = findViewById(R.id.register)

        login.setOnClickListener {
            Log.i(
                "Registration Items",
                "${genderTitle.selectedItem} ${name.text}\n${code.text} ${number.text}\n${address.text}"
            )
        }
    }
}
