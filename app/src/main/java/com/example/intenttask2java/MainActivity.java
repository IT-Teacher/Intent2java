package com.example.intenttask2java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.intenttask2java.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this,SecondActivity.class);

        EditText name = findViewById(R.id.name);
        EditText age = findViewById(R.id.age);
        Button send = findViewById(R.id.send);

        String a = age.getText().toString();
        String n = name.getText().toString();

        User user = new User(n,a);

        send.setOnClickListener(view -> {
            intent.putExtra("user",user);
            startActivity(intent);
        });
    }
}