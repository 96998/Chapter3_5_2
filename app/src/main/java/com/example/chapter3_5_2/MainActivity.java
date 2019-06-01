package com.example.chapter3_5_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.main);
    }

    public void click(View v) {
        Toast.makeText(MainActivity.this, "点击了按钮" + v.getId(), Toast.LENGTH_SHORT).show();
    }
}
