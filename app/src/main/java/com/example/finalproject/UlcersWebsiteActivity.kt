package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class UlcersWebsiteActivity : AppCompatActivity() {
    lateinit var myWeb: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ulcers_website)

        myWeb = findViewById(R.id.mWeb2)
        val webSettings = myWeb.settings
        webSettings.javaScriptEnabled = true
        myWeb.loadUrl("https://www.medicalnewstoday.com/articles/322740")

    }
}