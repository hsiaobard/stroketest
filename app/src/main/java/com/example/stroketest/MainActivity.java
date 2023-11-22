package com.example.stroketest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.stroketest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    MyViewModel myViewModel;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        myViewModel = new ViewModelProvider(this).get(MyViewModel.class);
        binding.setData(myViewModel);
        binding.setLifecycleOwner(this);

        binding.submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.resultText.setText("選取的症狀編號集合：" + myViewModel.selectedSymptoms.getValue().toString());
                binding.selectedSymptomText.setText("選取的症狀：" + myViewModel.selectedSymptomsText.getValue().toString());
            }
        });


        binding.confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, differ.class);
                intent.putStringArrayListExtra("resultNumber", myViewModel.selectedSymptoms.getValue());
                startActivity(intent);
            }
        });
    }
}