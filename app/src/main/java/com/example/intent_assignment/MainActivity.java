package com.example.intent_assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button UrlButton,DialerButton;
    EditText  UrlText,DialerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UrlButton = findViewById(R.id.UrlButton);
        DialerButton=findViewById(R.id.DialerButton);
        UrlText = findViewById(R.id.UrlText);
        DialerText = findViewById(R.id.DialerText);

        UrlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent OpenUrl = new Intent(Intent.ACTION_VIEW);
                OpenUrl.setData(Uri.parse("https://"+UrlText.getText().toString()));
                startActivity(OpenUrl);
            }
        });
        DialerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Dial = new Intent(Intent.ACTION_DIAL);
                Dial.setData(Uri.parse("tel:"+DialerText.getText().toString()));
                startActivity(Dial);
            }
        });
    }
}