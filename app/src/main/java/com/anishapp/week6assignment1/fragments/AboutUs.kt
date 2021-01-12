package com.anishapp.week6assignment1.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import com.anishapp.week6assignment1.R

class AboutUs : Fragment() {
    private lateinit var Webview : WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_about_us, container, false)
        Webview = view.findViewById(R.id.Webview)
        Webview.loadUrl("https://softwarica.edu.np/")
        return view
    }
}