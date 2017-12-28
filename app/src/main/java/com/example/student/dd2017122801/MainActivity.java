package com.example.student.dd2017122801;

import android.app.Instrumentation;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);
        et = findViewById(R.id.editText);
    }

    public void click1(View v)
    {
        tv.setText("Good Morning");
    }

    public void click2(View v)
    {
        Intent it =new Intent(MainActivity.this, SecActivity.class);
        it.putExtra("data", et.getText().toString());
        startActivity(it);
    }

    public void click3(View v)
    {
        Intent it=new Intent(MainActivity.this, Main2Activity.class);
        it.putExtra("data", et.getText().toString());
        startActivityForResult(it,123);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK)
        {
            tv.setText(data.getStringExtra("myresult"));
        }
    }
}
