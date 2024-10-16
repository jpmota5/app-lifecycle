package com.example.lifecycleactivity

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets



        }
        Toast.makeText(getApplicationContext(), "onCreate chamado", Toast.LENGTH_SHORT).show();
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(getApplicationContext(), "onStart chamado", Toast.LENGTH_SHORT).show();
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(getApplicationContext(), "onRestart chamado", Toast.LENGTH_SHORT).show();
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(getApplicationContext(), "onResume chamado", Toast.LENGTH_SHORT).show();
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(getApplicationContext(), "onPause chamado", Toast.LENGTH_SHORT).show();
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(getApplicationContext(), "onStop chamado", Toast.LENGTH_SHORT).show();
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(getApplicationContext(), "onDestroy chamado", Toast.LENGTH_SHORT).show();
    }
}