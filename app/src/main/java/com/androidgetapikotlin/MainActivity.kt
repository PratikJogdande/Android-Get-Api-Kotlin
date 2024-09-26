package com.androidgetapikotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var btn_jokes: Button
    private lateinit var tv_jokes: TextView
    private lateinit var progressBar: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_jokes = findViewById(R.id.btn_joke)
        tv_jokes = findViewById(R.id.tv_joke)
        progressBar = findViewById(R.id.idLoadingPB)

        btn_jokes.setOnClickListener {
            progressBar.visibility = View.VISIBLE

            ApiCall().getjokes(this) { jokes ->
                tv_jokes.text = jokes.value
                progressBar.visibility = View.GONE
            }
        }
    }
}