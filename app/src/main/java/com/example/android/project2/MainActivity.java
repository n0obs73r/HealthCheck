package com.example.android.project2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity {

    int i= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayMessage ( String s)
    {
        TextView text = findViewById(R.id.text);
        text.setText(MessageFormat.format("You answered {0} current health level is {1}", s, i));
    }
    public void displayMessage ()
    {
        TextView text = findViewById(R.id.text);
        text.setText(R.string.message_sometimes);
    }

    public void yes(View view) {
        ++i;
        displayMessage("yes");

    }

    public void no(View view) {
        --i;
        displayMessage("no");
    }

    public void sometimes(View view) {
        displayMessage();


    }
}