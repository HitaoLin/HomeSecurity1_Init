package com.example.lht11.homesecurity1_init;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class Title extends AppCompatActivity {
    private Button ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.include_title);
        ivBack = findViewById(R.id.ivBack);
    }


}
