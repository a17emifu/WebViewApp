package com.example.brom.webviewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        //För att visa WebView för intern webbsidan
        WebView mysecondView = (WebView) findViewById(R.id.secondview);
        mysecondView.setWebViewClient(new WebViewClient());
        mysecondView.loadUrl("file:///android_asset/about.html");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //För menybar
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        //if-satser för att gå vidare till andra sidor: inställningar och "about us"
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.about) {
            Intent intent = new Intent(this, AboutUs.class) ;
            startActivity(intent);


        }

        return super.onOptionsItemSelected(item);
    }
    //Man kan gå tillbaks till förra sidan genom att trycka på bakåt knappen
    public void onClick( View v_ )
    {
        finish();
    }
}


