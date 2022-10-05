package com.example.tk88tintuc;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        setContentView(R.layout.activity_web_view);
        webView = findViewById(R.id.webview);
        Intent intent = getIntent();
        String link = intent.getStringExtra("linknews");
        webView.loadUrl(link);
        webView.setWebViewClient(new WebViewClient());
    }
}