package com.example.nars.helloworldapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        EditText textUserMessage = (EditText) findViewById(R.id.textUserMessage);
        String userMessage = textUserMessage.getText().toString();

        Intent intentMessageActivity = new Intent(this, MessageActivity.class);
        intentMessageActivity.putExtra("com.example.nars.USER_MESSAGE", userMessage);
        startActivity(intentMessageActivity);
    }
}
