package com.zjgsu.kongyizhen.layoutdemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.secondButton);
        btn1.setOnClickListener(v ->{
            Toast.makeText(this,"打开第二个页面", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        });
        Button btn2 = findViewById(R.id.baidu);
        btn2.setOnClickListener(v -> {
            String url = "https://www.baidu.com";
            Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intent3);
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        Intent intent2 = getIntent();
    }
}