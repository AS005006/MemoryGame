package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    protected WebView game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        game=(WebView) findViewById(R.id.game);
        game.setInitialScale(1);
        game.getSettings().setUseWideViewPort(true);
        game.getSettings().setJavaScriptEnabled(true);
        game.getSettings().setLoadWithOverviewMode(true);
        game.getSettings().setAllowContentAccess(true);
        game.getSettings().setDomStorageEnabled(true);
        game.getSettings().setAllowFileAccessFromFileURLs(true);
        game.getSettings().setAllowUniversalAccessFromFileURLs(true);




        game.loadUrl("file:///android_asset/game2/game2.html");
    }
}