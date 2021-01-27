package com.markysproject.scrolllllll;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView readed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        readed = (TextView) findViewById(R.id.readed);
        Intent getData = getIntent();
        String textData = getData.getStringExtra("thekey");

        readed.setText(""+textData);
    }
}