package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.testapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private String numA;
    private String numB;
    private String result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setupUI();
        divideUI();    }
    private void setupUI() {
        binding.btnAdd.setOnClickListener(view -> {
            Math math = new Math();
            numA = binding.edNumA.getText().toString();
            numB = binding.edNumB.getText().toString();
            result = math.add(numA, numB);
            binding.resultTv.setText(result);
        });
    }

    private void divideUI() {
        binding.btnDivide.setOnClickListener(view -> {
            Math math = new Math();
            numA = binding.edNumA.getText().toString();
            numB = binding.edNumB.getText().toString();
            result = math.divide(numA, numB);
            binding.resultTv.setText(result);
        });
    }
}