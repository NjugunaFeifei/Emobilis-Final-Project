package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class AllergiesWebsiteActivity : AppCompatActivity() {
    lateinit var myWeb: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_allergies_website)

        myWeb = findViewById(R.id.mWeb1)
        val webSettings = myWeb.settings
        webSettings.javaScriptEnabled = true
        myWeb.loadUrl("https://www.medicalnewstoday.com/articles/321500#treatment-for-mild-allergic-reactions")

    }
}