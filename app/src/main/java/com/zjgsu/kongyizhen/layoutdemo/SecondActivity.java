package com.zjgsu.kongyizhen.layoutdemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        Button btn2 = findViewById(R.id.secondButton);
        btn2.setOnClickListener(v -> {
            Intent intent2 = new Intent(this,MainActivity.class);
            startActivity(intent2);
        });
        Button btn3 = findViewById(R.id.baidu2);
        btn2.setOnClickListener(v -> {
            String url = "https://www.baidu.com";
            Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent4);
        });
    }
}