package com.example.ip.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class eatsound_5 extends AppCompatActivity {
    WebView web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eating_sound);

        web=(WebView) this.findViewById(R.id.web1) ;
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);

        web.loadUrl("https://www.youtube.com/watch?v=E9henUGa5MM");
    }
}