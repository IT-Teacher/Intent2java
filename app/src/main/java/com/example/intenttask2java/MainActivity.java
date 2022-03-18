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


        Button send = findViewById(R.id.send);



        User user = new User("Ali",34);

        send.setOnClickListener(view -> {
            intent.putExtra("user",user);
            startActivity(intent);
        });
    }
}