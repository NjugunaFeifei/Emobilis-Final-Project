package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class AsthmaWebsiteActivity : AppCompatActivity() {
    lateinit var myWeb:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_asthma_website)

        myWeb  = findViewById(R.id.mWeb)
        val webSettings = myWeb.settings
        webSettings.javaScriptEnabled = true
        myWeb.loadUrl("https://www.health.nsw.gov.au/environment/air/Publications/steps-asthma-first-aid.pdf")

    }
}