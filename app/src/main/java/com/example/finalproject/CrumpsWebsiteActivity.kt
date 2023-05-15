package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class CrumpsWebsiteActivity : AppCompatActivity() {
    lateinit var myWeb: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crumps_website)

        myWeb = findViewById(R.id.mWeb4)
        val webSettings = myWeb.settings
        webSettings.javaScriptEnabled = true
        myWeb.loadUrl("https://www.houstonmethodist.org/blog/articles/2021/sep/menstrual-cramps-5-tips-for-getting-relief-from-period-pain/")

    }
}