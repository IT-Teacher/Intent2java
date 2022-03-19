package com.example.intenttask2java;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.intenttask2java.model.Member;
import com.example.intenttask2java.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this,SecondActivity.class);


        Button send = findViewById(R.id.send);
        TextView tv = findViewById(R.id.tv1);


        User user = new User("Ali",34);

        ActivityResultLauncher<Intent> sendData = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {
                        if (result.getResultCode() == Activity.RESULT_OK){
                            Intent data = result.getData();
                            Member member = (Member) data.getSerializableExtra("member");
                            tv.setText(member.toString());
                        }
                    }
                }
        );

        send.setOnClickListener(view -> {
            intent.putExtra("user",user);
            sendData.launch(intent);
        });
    }
}