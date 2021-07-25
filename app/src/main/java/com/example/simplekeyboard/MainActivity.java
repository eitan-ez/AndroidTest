package com.example.simplekeyboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textViewKeyboardOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewKeyboardOutput = findViewById(R.id.textViewKeyboardOutput);
    }

    public void setTyping(View view) {
        String text = textViewKeyboardOutput.getText().toString();
        if (view.getTag().toString().equals("clear")) {
            textViewKeyboardOutput.setText("");
            return;
        }
        if (view.getTag().toString().equals("_")) {
            textViewKeyboardOutput.setText("");
            textViewKeyboardOutput.setText(text + " ");
            return;
        }
        textViewKeyboardOutput.setText(text + view.getTag().toString());
    }
}