package com.example.stroketest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
        //***********辯證部分************//

        String storke_Parameter_Data_path= getFilesDir() + "/stroke_differentiator_parameter.json";
        String stroke_Syndrome_Data_path= getFilesDir() + "/stroke_syndormes_symptoms_mapping.json";
        stroke_differentiator = new differentiator(stroke_Syndrome_Data_path,storke_Parameter_Data_path);

        if(stroke_differentiator != null){
            resultTextView.setText("1");
            result_list = stroke_differentiator.Differentiation_syndrome(symptomSet, 0.1);
        }
        
        String[] differentiator_output = new String[9];
        int i=0;
		for (Map.Entry<String, Double> syndrome : result_list.entrySet()) {
			// 使用 StringBuilder 將 score 和 syndrome name 組合成一個字串
			StringBuilder output = new StringBuilder();
			output.append(String.format("Syndrome_Name: %-4s, Score: %.2f", syndrome.getKey(), syndrome.getValue()));

			// 將字串存入陣列
			differentiator_output[i] = output.toString();
			i++;
		}
		
	        StringBuilder output = new StringBuilder();
			for (String string : differentiator_output) {
			    output.append(string);
			    output.append("\n");
			}


		// 將合併後的字串轉換為 String 物件
		String Text = output.toString();

		resultTextView.setText(Text); // Syndrome_Name: A, Score: 0.95, Syndrome_Name: B, Score: 0.85, ...

        //按下按鈕後可以查看全部的辯證結果

        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBox.isChecked())
                    resultTextView.setVisibility(View.VISIBLE);
                else
                    resultTextView.setVisibility(View.INVISIBLE);
            }
        });

        ///////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////
        //*****根據分數排序產生前三個症候按鈕*********//
        //////////////////////////////////////////
        Button button1 = findViewById(R.id.button_1);
        Button button2 = findViewById(R.id.button_2);
        Button button3 = findViewById(R.id.button_3);


        // 取得LinkedHashMap的前三個元素
        List<Map.Entry<String, Double>> top3 = new ArrayList<>();

        for (Map.Entry<String, Double> entry : result_list.entrySet()) {
            top3.add(entry);
            if (top3.size() == 3) {
                break;
            }
        }
        button1.setText(String.format("%-4s  分數: %.2f", top3.get(0).getKey(), top3.get(0).getValue()));
        button2.setText(String.format("%-4s  分數: %.2f", top3.get(1).getKey(), top3.get(1).getValue()));
        button3.setText(String.format("%-4s  分數: %.2f", top3.get(2).getKey(), top3.get(2).getValue()));

        //跳轉至resultActivity，並傳遞症候名稱
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(differ.this, resultActivity.class);
                intent.putExtra("resultNumber", top3.get(0).getKey());
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(differ.this, resultActivity.class);
                intent.putExtra("resultNumber", top3.get(1).getKey());
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(differ.this, resultActivity.class);
                intent.putExtra("resultNumber", top3.get(2).getKey());
                startActivity(intent);
            }
        });
        ///////////////////////////////////////////////////////////////////////
        //little test incoming...



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
