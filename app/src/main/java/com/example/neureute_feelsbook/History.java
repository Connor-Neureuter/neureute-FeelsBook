package com.example.neureute_feelsbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class History extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EMOTION);

        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}
