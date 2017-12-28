package com.example.student.dd2017122801;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);

        TextView tv3 = findViewById(R.id.textView3);
        Intent it = getIntent();
        String str = it.getStringExtra("data");
        tv3.setText(str);
    }
}
