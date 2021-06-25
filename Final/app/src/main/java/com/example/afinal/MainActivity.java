package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText meditText1;
    Spinner mspM, mspD;
    int m, d;
    Button mbtn1,mbtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //關閉程式
        Button back = (Button) findViewById(R.id.btn3);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.os.Process.killProcess(android.os.Process.myPid());
                finish();
                System.exit(0);

            }
        });

        //findViewById
        meditText1 = findViewById(R.id.editText1);
        mspM = findViewById(R.id.spinnerM);
        mspD = findViewById(R.id.spinnerD);
        mbtn1 = findViewById(R.id.btn1);
        mbtn3 = findViewById(R.id.btn3);
    }

    public void Calculate(View view) {

        //取得月、日值
        String[] Sm = getResources().getStringArray(R.array.m);
        String[] Sd = getResources().getStringArray(R.array.d);

        int M = mspM.getSelectedItemPosition();
        int D = mspD.getSelectedItemPosition();

        m = Integer.parseInt(Sm[M]);
        d = Integer.parseInt(Sd[D]);

        //處理錯誤日期
        if (m==4 || m==6 || m==9 || m==11){
            if (d == 31) {
                Toast.makeText(this,"這天不存在喔，請重新選擇",Toast.LENGTH_SHORT).show();}
            else {
                bundle(); }
        }
        else if(m == 2) {
            if (d > 29) {
                Toast.makeText(this,"這天不存在喔，請重新選擇",Toast.LENGTH_SHORT).show();}
            else {
                bundle(); }
        }
        else {
            bundle(); }
    }

    //傳送月、日
    public void bundle() {
        mbtn1.setOnClickListener((v) ->{
            String name  = meditText1.getText().toString();
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("m", m);
            intent.putExtra("d", d);
            Bundle bundle = new Bundle();
            bundle.putString("name", name);
            intent.putExtras(bundle);
            startActivity(intent);
        } );
    }

}

