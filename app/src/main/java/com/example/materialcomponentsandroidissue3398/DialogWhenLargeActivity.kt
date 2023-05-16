package com.example.materialcomponentsandroidissue3398

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DialogWhenLargeActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(TextView(this).apply {
            text = "I am an activity"
        })
    }
}