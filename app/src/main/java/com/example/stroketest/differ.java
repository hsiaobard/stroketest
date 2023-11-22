package com.example.stroketest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import differentiator.differentiator;
import differentiator.Symptom_Set;


public class differ extends AppCompatActivity {
    static differentiator stroke_differentiator;
    static Symptom_Set symptomSet;
    static LinkedHashMap<String, Double> result_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_differ);

        Intent intent = getIntent();
        ArrayList<String> resultNumber = intent.getStringArrayListExtra("resultNumber");

        //String轉Integer
        ArrayList<Integer> integerList = new ArrayList<>();
        for (String str : resultNumber) {
            integerList.add(Integer.parseInt(str));
        }

        symptomSet = new Symptom_Set(integerList);

        TextView resultTextView = findViewById(R.id.textView12);
        resultTextView.setText(resultNumber.toString());


        ///////////////////////////////////////////////////////////////////////
        //File internalDir = getFilesDir();
        //String internalPath = null;

        //resultTextView.setText(internalPath);

        String storke_Parameter_Data_path= getFilesDir() + "/stroke_differentiator_parameter.json";
        String stroke_Syndrome_Data_path= getFilesDir() + "/stroke_syndormes_symptoms_mapping.json";
        stroke_differentiator = new differentiator(stroke_Syndrome_Data_path,storke_Parameter_Data_path);

        if(stroke_differentiator != null){
            resultTextView.setText("1");
            result_list = stroke_differentiator.Differentiation_syndrome(symptomSet, 0.1);
        }

        for (Map.Entry<String, Double> syndrome : result_list.entrySet()) {
            System.out.println(
                    String.format("Score: %.5f, Syndrome_Name: %-15s", syndrome.getValue(), syndrome.getKey()));
            resultTextView.setText(syndrome.getKey() + syndrome.getValue());
            String random;
        }
        ///////////////////////////////////////////////////////////////////////

        Button button = findViewById(R.id.seebutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(differ.this, resultActivity.class);
                intent.putExtra("resultNumber", "1");
                startActivity(intent);


            }
        });
    }


}
