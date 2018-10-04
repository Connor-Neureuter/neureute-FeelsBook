package com.example.neureute_feelsbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EMOTION = "com.example.neureuteFeelsBook2.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendAngerEmotion(View view) {
        Intent intent = new Intent(this, RecordEmotion.class);
        EditText editText =  findViewById(R.id.editText2);
        String message = editText.getText().toString();
        intent.putExtra(EMOTION, message);
        startActivity(intent);

    }

    public void sendFearEmotion(View view) {
        Intent intent = new Intent(this, RecordEmotion.class);
        EditText editText =  findViewById(R.id.editText3);
        String message = editText.getText().toString();
        intent.putExtra(EMOTION, message);
        startActivity(intent);
    }

    public void sendJoyEmotion(View view) {
        Intent intent = new Intent(this, RecordEmotion.class);
        EditText editText =  findViewById(R.id.editText4);
        String message = editText.getText().toString();
        intent.putExtra(EMOTION, message);
        startActivity(intent);
    }

    public void sendLoveEmotion(View view) {
        Intent intent = new Intent(this, RecordEmotion.class);
        EditText editText =  findViewById(R.id.editText5);
        String message = editText.getText().toString();
        intent.putExtra(EMOTION, message);
        startActivity(intent);
    }

    public void sendSadnessEmotion(View view) {
        Intent intent = new Intent(this, RecordEmotion.class);
        EditText editText =  findViewById(R.id.editText6);
        String message = editText.getText().toString();
        intent.putExtra(EMOTION, message);
        startActivity(intent);
    }

    public void sendSurpriseEmotion(View view) {
        Intent intent = new Intent(this, RecordEmotion.class);
        EditText editText =  findViewById(R.id.editText7);
        String message = editText.getText().toString();
        intent.putExtra(EMOTION, message);
        startActivity(intent);    }

    public void viewHistroy(View view) {
        Intent intent = new Intent(this, History.class);
        startActivity(intent);    }
}
