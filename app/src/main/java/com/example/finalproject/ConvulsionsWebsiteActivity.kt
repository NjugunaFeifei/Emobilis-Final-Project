package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class ConvulsionsWebsiteActivity : AppCompatActivity() {
    lateinit var myWeb: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_convulsions_website)

        myWeb = findViewById(R.id.mWeb5)
        val webSettings = myWeb.settings
        webSettings.javaScriptEnabled = true
        myWeb.loadUrl("https://www.healthline.com/health/types-of-seizures")

    }
}