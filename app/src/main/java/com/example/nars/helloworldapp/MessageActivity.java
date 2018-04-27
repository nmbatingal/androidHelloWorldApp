package com.example.nars.helloworldapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        // String message = getIntent().getExtras().getString("mainactivity");
        String textMessage = getIntent().getExtras().getString("com.example.nars.USER_MESSAGE");
        TextView textUserMessage = (TextView) findViewById(R.id.textUserMessage);

        textUserMessage.setText(textMessage);
    }
}
