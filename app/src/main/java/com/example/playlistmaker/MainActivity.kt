package com.example.playlistmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)

        super.onCreate(savedInstanceState)
        val image = findViewById<Button>(R.id.search)
        val imageClickListener: View.OnClickListener = object : View.OnClickListener {
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity, "Тост с любым сообщением =)", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        image.setOnClickListener(imageClickListener)

        val buttonMediateka = findViewById<Button>(R.id.mediateka)
        buttonMediateka.setOnClickListener {
            Toast.makeText(this@MainActivity, "Тут тоже ТОСТ!", Toast.LENGTH_SHORT).show()
        }

        val buttonSettings = findViewById<Button>(R.id.settings)
        buttonSettings.setOnClickListener {
            Toast.makeText(this@MainActivity, "Третья кнопка работает!", Toast.LENGTH_SHORT).show()
        }
    }
}



