package com.example.brom.webviewapp;
//Vad är "uppcheckad kod" på feedback? Jag gissar att det är komment och försöker fixa.
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //För att visa WebView för extern webbsidor
        WebView myWebView = (WebView) findViewById(R.id.mywebview);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("https://www.google.com/");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //boolean för menybar
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
}
