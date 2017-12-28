package com.example.student.dd2017122801;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    EditText et, et4;
    final int RESULT_PAGE_2 = 123;
    final int RESULT_PAGE_3 = 456;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);
        et = findViewById(R.id.editText);
        et4 = findViewById(R.id.editText4);
    }

    public void click1(View v)
    {
        tv.setText("Good Morning");
    }

    public void click2(View v)
    {
        Intent it = new Intent(MainActivity.this, SecActivity.class);
        it.putExtra("data", et.getText().toString());
        startActivity(it);
    }

    public void click3(View v)
    {
        Intent it= new Intent(MainActivity.this, Main2Activity.class);
        it.putExtra("data", et.getText().toString());
        startActivityForResult(it, RESULT_PAGE_2);
    }

    public void click4(View v)
    {
        Intent it= new Intent(MainActivity.this, Main3Activity.class);
        it.putExtra("data", et4.getText().toString());
        startActivityForResult(it, RESULT_PAGE_3);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 123)
        {
            if(resultCode == RESULT_OK)
            {
                tv.setText(data.getStringExtra("myresult"));
            }
        }

        if (requestCode == 456)
        {
            if(resultCode == RESULT_OK)
            {
                et4.setText(data.getStringExtra("myresult"));
            }
        }
    }
}
