package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class StomachWebsiteActivity : AppCompatActivity() {
    lateinit var mWeb: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stomach_website)

        mWeb = findViewById(R.id.mWeb3)
        val webSettings = mWeb.settings
        webSettings.javaScriptEnabled = true
        mWeb.loadUrl("https://www.medicalnewstoday.com/articles/322047#causes")

    }
}