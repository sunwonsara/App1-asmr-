package com.example.ip.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import java.util.HashMap;

public class TwoActivity extends AppCompatActivity implements View.OnClickListener {
    HashMap<Integer, String> urlHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        urlHash = new HashMap<>();

        final Button btn1=(Button)findViewById(R.id.but_1);
        Button btn2=(Button)findViewById(R.id.but_2);
        Button btn3=(Button)findViewById(R.id.but_3);
        Button btn4=(Button)findViewById(R.id.but_4);
        Button btn5=(Button)findViewById(R.id.but_5);
        Button btn6=(Button)findViewById(R.id.but_6);

        urlHash.put(R.id.but_1, "https://www.youtube.com/watch?v=Vhk6R76yjC0&t=1429s");
        urlHash.put(R.id.but_2, "https://www.youtube.com/watch?v=Vhk6R76yjC0&t=1429s");
        urlHash.put(R.id.but_3, "https://www.youtube.com/watch?v=Vhk6R76yjC0&t=1429s");
        urlHash.put(R.id.but_4, "https://www.youtube.com/watch?v=Vhk6R76yjC0&t=1429s");
        urlHash.put(R.id.but_5, "https://www.youtube.com/watch?v=Vhk6R76yjC0&t=1429s");
        urlHash.put(R.id.but_6, "https://www.youtube.com/watch?v=Vhk6R76yjC0&t=1429s");

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent=new Intent(TwoActivity.this, ASMRVideoActivity.class);
        intent.putExtra("video_url", urlHash.get(v.getId()));
        startActivity(intent);
    }
}

