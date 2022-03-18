package com.example.intenttask2java;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.intenttask2java.model.User;

public class SecondActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView res = findViewById(R.id.res);

        User user = (User) (getIntent().getSerializableExtra("user"));
        String sas = user.toString();
        res.setText(sas);
    }
}
