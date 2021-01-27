package com.markysproject.scrolllllll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnread;
    private TextView tvtext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvtext = (TextView) findViewById(R.id.tvtext);
        btnread = (Button) findViewById(R.id.btnread);
        btnread.setOnClickListener(v -> doIT());
    }

    public void doIT(){
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("thekey","okay u read it");
        startActivity(intent);
    }
}