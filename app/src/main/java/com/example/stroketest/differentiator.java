package com.example.stroketest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class differentiator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_differentiator);

        Intent intent = getIntent();
        ArrayList<String> resultNumber = intent.getStringArrayListExtra("resultNumber");

        TextView resultTextView = findViewById(R.id.textView12);
        resultTextView.setText(resultNumber.toString());

        Button button = findViewById(R.id.seebutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(differentiator.this, resultActivity.class);
                intent.putExtra("resultNumber", "1");
                startActivity(intent);
            }
        });
    }


}