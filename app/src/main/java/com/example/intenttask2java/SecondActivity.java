package com.example.intenttask2java;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.intenttask2java.model.Member;
import com.example.intenttask2java.model.User;

public class SecondActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView res = findViewById(R.id.res);
        Button exit = findViewById(R.id.exit);
        Member member = new Member("Vali",26);

        User user = (User) (getIntent().getSerializableExtra("user"));
        String sas = user.toString();
        res.setText(sas);

        exit.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.putExtra("member",member);
            setResult(Activity.RESULT_OK,intent);
            finish();
        });

    }
}
