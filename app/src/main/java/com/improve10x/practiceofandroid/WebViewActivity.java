package com.improve10x.practiceofandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.improve10x.practiceofandroid.databinding.ActivityWebViewBinding;

public class WebViewActivity extends AppCompatActivity {
    ActivityWebViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWebViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("WebView");
        setWebView();

    }

    private void setWebView() {
        WebView myWebView = (WebView)  binding.webView;
        myWebView.loadUrl("file:///android_asset/myresource.html");
    }


}