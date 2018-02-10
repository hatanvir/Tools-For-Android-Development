package com.example.tanvir.primeasiauniversity;

import android.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
   WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView=findViewById(R.id.WebViewIdXml);

        webView.loadUrl("http://www.primeasia.edu.bd/");

        //javascript enable
        WebSettings webSettings =webView.getSettings();
        webSettings.getJavaScriptEnabled();

        //for visiting more page
        webView.setWebViewClient(new WebViewClient());
    }
}
