package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textcon, textdate, textView5, mtextjob, mtextcon, mtextlove, mtextmoney, mtextword, mtextView15;
    int m, d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //返回
        Button back = (Button) findViewById(R.id.btn2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.os.Process.killProcess(android.os.Process.myPid());
                finish();
                System.exit(0);
            }
        });

        textcon = findViewById(R.id.textcon);
        textdate = findViewById(R.id.textdate);
        textView5 = findViewById(R.id.textView5);
        mtextjob = findViewById(R.id.textjob);
        mtextcon = findViewById(R.id.textcon);
        mtextlove = findViewById(R.id.textlove);
        mtextmoney = findViewById(R.id.textmoney);
        mtextword = findViewById(R.id.textword);
        mtextView15 = findViewById(R.id.textView15);

        //接收name
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        TextView txtContent = (TextView) findViewById(R.id.textView5);
        txtContent.setText(name);

        //接收月、日
        m = getIntent().getIntExtra("m", 1);
        d = getIntent().getIntExtra("d", 1);
        textdate.setText(m + "月" + d + "日");

        //判斷星座
        switch (m) {
            case 1:
                if (d > 20) {
                    textcon.setText(" 水瓶座♒");
                } else {
                    textcon.setText(" 魔羯座♑");
                }
                break;
            case 2:
                if (d > 19) {
                    textcon.setText(" 雙魚座♓");
                } else {
                    textcon.setText(" 水瓶座♒");
                }
                break;
            case 3:
                if (d > 20) {
                    textcon.setText(" 牡羊座♈");
                } else {
                    textcon.setText(" 雙魚座♓");
                }
                break;
            case 4:
                if (d > 20) {
                    textcon.setText(" 金牛座♉");
                } else {
                    textcon.setText(" 牡羊座♈");
                }
                break;
            case 5:
                if (d > 21) {
                    textcon.setText(" 雙子座♊");
                } else {
                    textcon.setText(" 金牛座♉");
                }
                break;
            case 6:
                if (d > 21) {
                    textcon.setText(" 巨蟹座♋");
                } else {
                    textcon.setText(" 雙子座♊");
                }
                break;
            case 7:
                if (d > 22) {
                    textcon.setText(" 獅子座♌");
                } else {
                    textcon.setText(" 巨蟹座♋");
                }
                break;
            case 8:
                if (d > 22) {
                    textcon.setText(" 處女座♍");
                } else {
                    textcon.setText(" 獅子座♌");
                }
                break;
            case 9:
                if (d > 22) {
                    textcon.setText(" 天秤座♎");
                } else {
                    textcon.setText(" 處女座♍");
                }
                break;
            case 10:
                if (d > 23) {
                    textcon.setText(" 天蠍座♏");
                } else {
                    textcon.setText(" 天秤座♎");
                }
                break;
            case 11:
                if (d > 22) {
                    textcon.setText(" 射手座♐");
                } else {
                    textcon.setText(" 天蠍座♏");
                }
                break;
            case 12:
                if (d > 21) {
                    textcon.setText(" 魔羯座♑");
                } else {
                    textcon.setText(" 射手座♐");
                }
                break;
        }

        //工作運勢
        int a = (int)(Math.random()*5 + 1);
        switch (a) {
            case 1:
                mtextjob.setText("✪");
                break;
            case 2:
                mtextjob.setText("✪✪");
                break;
            case 3:
                mtextjob.setText("✪✪✪");
                break;
            case 4:
                mtextjob.setText("✪✪✪✪");
                break;
            case 5:
                mtextjob.setText("✪✪✪✪✪");
                break;
        }

        //愛情運勢
        int b = (int)(Math.random()*5 + 1);
        switch (b) {
            case 1:
                mtextlove.setText("❤");
                break;
            case 2:
                mtextlove.setText("❤❤");
                break;
            case 3:
                mtextlove.setText("❤❤❤");
                break;
            case 4:
                mtextlove.setText("❤❤❤❤");
                break;
            case 5:
                mtextlove.setText("❤❤❤❤❤");
                break;
        }

        //金錢運勢
        int c = (int)(Math.random()*5 + 1);
        switch (c) {
            case 1:
                mtextmoney.setText("$");
                break;
            case 2:
                mtextmoney.setText("$ $");
                break;
            case 3:
                mtextmoney.setText("$ $ $");
                break;
            case 4:
                mtextmoney.setText("$ $ $ $");
                break;
            case 5:
                mtextmoney.setText("$ $ $ $ $");
                break;
        }

        //每日精神小語
        int d = (int)(Math.random()*10 + 1);
        switch (d) {
            case 1:
                mtextword.setText("一個細節足以改變人生。");
                break;
            case 2:
                mtextword.setText("一分耕耘，一分收獲。");
                break;
            case 3:
                mtextword.setText("把握當下，就是用心。");
                break;
            case 4:
                mtextword.setText("持之以恆，精益求精。");
                break;
            case 5:
                mtextword.setText("近朱者赤，近墨者黑。");
                break;
            case 6:
                mtextword.setText("挫折是強者的機遇。");
                break;
            case 7:
                mtextword.setText("信心是命運的主宰。");
                break;
            case 8:
                mtextword.setText("實打實地往前走。");
                break;
            case 9:
                mtextword.setText("堅持就是勝利。");
                break;
            case 10:
                mtextword.setText("知識玩轉財富。");
                break;
        }

        //綜合運勢
        if (a + b+ c <=3)
            mtextView15.setText("⭐");
        else if(a + b+ c <=6)
            mtextView15.setText("⭐⭐");
        else if(a + b+ c <=9)
            mtextView15.setText("⭐⭐⭐");
        else if(a + b+ c <=12)
            mtextView15.setText("⭐⭐⭐⭐");
        else
            mtextView15.setText("⭐⭐⭐⭐⭐");
        }
}