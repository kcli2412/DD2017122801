package com.example.student.dd2017122801;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.security.PublicKey;

public class Main3Activity extends AppCompatActivity {
    EditText et4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent it = getIntent();
        String str = it.getStringExtra("data");

        et4 = findViewById(R.id.editText4);
        et4.setText(str);
    }

    public void click3(View v)
    {
        Intent it=new Intent();
        it.putExtra("myresult",et4.getText().toString());
        setResult(RESULT_OK, it);
        finish();
    }
}
