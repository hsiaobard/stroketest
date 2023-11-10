package com.example.stroketest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class resultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String resultNumber = intent.getStringExtra("resultNumber");
        TextView resultTextView = findViewById(R.id.resultPageText);
        resultTextView.setText(resultNumber);
    }
}