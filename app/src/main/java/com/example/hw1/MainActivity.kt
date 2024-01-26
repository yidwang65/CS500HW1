package com.example.hw1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.hw1.ui.theme.Hw1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickMeButton = findViewById<Button>(R.id.click_me)

        clickMeButton.setOnClickListener {
            //Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show()
            var display_text : TextView = findViewById<TextView>(R.id.text_view)
            display_text.setText("Hello World")
        }
    }
}

