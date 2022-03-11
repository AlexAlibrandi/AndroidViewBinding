package com.android.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root

        setContentView(view)

        mainBinding.button.setOnClickListener {
            mainBinding.textView.text = mainBinding.edit.text.toString()
        }
    }
}