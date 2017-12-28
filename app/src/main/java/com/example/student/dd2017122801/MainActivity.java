package com.example.student.dd2017122801;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click1(View v)
    {
        TextView tv = findViewById(R.id.textView);
        tv.setText("Good Morning");
    }

    public void click2(View v)
    {
        Intent it =new Intent(MainActivity.this, SecActivity.class);
        EditText et = findViewById(R.id.editText);
        it.putExtra("data", et.getText().toString());
        startActivity(it);
    }
}
