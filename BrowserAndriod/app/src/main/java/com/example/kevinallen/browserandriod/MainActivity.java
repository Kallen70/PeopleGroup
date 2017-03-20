package com.example.kevinallen.browserandriod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
    implements View.OnClickListener

{


    EditText addressBar;
    Button backButton;
    Button forwardButton;
    Button goButton;
    WebView webview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addressBar = (EditText) findViewById(R.id.editText);
        backButton = (Button)findViewById((R.id.button));
        forwardButton = (Button) findViewById(R.id.button2);
        goButton = (Button)findViewById(R.id.button3);
        webview = (WebView) findViewById(R.id.webView);


        backButton.setOnClickListener((this));
        forwardButton.setOnClickListener((this));
        goButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v){
        if (v == backButton) {
            webview.goBack();
        }

        else  if (v == forwardButton){
            webview.goForward();
        }else  if (v == goButton){
            String address = addressBar.getText().toString();
            if (!address.startsWith("http")){
                address = "http://" + address;
            }
            webview.loadUrl(address);
        }
    }
}
