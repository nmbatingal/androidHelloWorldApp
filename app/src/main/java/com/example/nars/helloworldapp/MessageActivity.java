package com.example.nars.helloworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        // Intent intent = getIntent();
        // String textMessage = intent.getStringExtra("com.example.nars.USER_MESSAGE");
        String textMessage = getIntent().getStringExtra("com.example.nars.USER_MESSAGE");
        TextView textUserMessage = (TextView) findViewById(R.id.textViewMessage);

        textUserMessage.setText(textMessage);
    }

    public void openFinalActivity(View view) {
        startActivity(new Intent(this, FinalActivity.class));
    }
}