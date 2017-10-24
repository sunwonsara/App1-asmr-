package com.example.ip.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Timer;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button but_1 = (Button)findViewById(R.id.but_1);
        but_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, OneActivity.class);
                startActivity(intent);
            }
        });

        Button but_2 = (Button)findViewById(R.id.but_2);
        but_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, TwoActivity.class);
                startActivity(intent);
            }
        });

        Button but_3 = (Button)findViewById(R.id.but_3);
        but_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, TwoActivity.class);
                startActivity(intent);
            }
        });

        Button but_4 = (Button)findViewById(R.id.but_4);
        but_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, TwoActivity.class);
                startActivity(intent);
            }
        });

        Button but_5 = (Button)findViewById(R.id.but_5);
        but_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, TwoActivity.class);
                startActivity(intent);
            }
        });

        Button but_6 = (Button)findViewById(R.id.but_6);
        but_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, TwoActivity.class);
                startActivity(intent);
            }
        });


        Handler handler = new Handler() { //1시간후 자동 앱 종료
            @Override
            public void handleMessage(Message msg) {
                overridePendingTransition(0, 0);
                finish();
            }
        };
        handler.sendEmptyMessageDelayed(0, 3600000); //1초 : 1000 , 1분 : 60000 , 1시간 : 3600000

    }
}
