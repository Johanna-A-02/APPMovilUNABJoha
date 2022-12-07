package com.example.appmovilunab;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ProfesorActivity extends AppCompatActivity {

    Button ImageButt7;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profesor);

//        ImageButt7=findViewById(R.id.ImageButt7);
//        ImageButt7.setOnClickListener(new View.OnClickListener() {

//            @Override
//            public void onClick(View view) {
//                Intent intent2=new Intent(ProfesorActivity.this, MainActivity.class);
//                startActivity(intent2);
//            }
//        });
    }
}
