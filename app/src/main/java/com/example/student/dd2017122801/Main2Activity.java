package com.example.student.dd2017122801;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent it = getIntent();
        String str = it.getStringExtra("data");

        b1 = findViewById(R.id.editText2);
        b1.setText(str);
    }

    public void clickOkay(View v)
    {
        Intent it = new Intent();
        it.putExtra("myresult", b1.getText().toString());
        setResult(RESULT_OK, it);
        finish();
    }

    public void clickCancel(View v)
    {
        finish();
    }
}
