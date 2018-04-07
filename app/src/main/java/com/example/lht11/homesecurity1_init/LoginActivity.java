package com.example.lht11.homesecurity1_init;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import java.io.IOException;

public class LoginActivity extends AppCompatActivity {

    private RadioButton rbLogin, rbSimulation;
    private Button ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        rbLogin = findViewById(R.id.rbLogin);
        rbSimulation = findViewById(R.id.rbSimulation);
        ivBack = findViewById(R.id.ivBack);
       /* rbSimulation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this,SelectActivity.class));
            }
        });*/


    }

    public void MyClick(View view) {
        Runtime runtime = Runtime.getRuntime();
        switch (view.getId()) {
            case R.id.rbSimulation:
                startActivity(new Intent(LoginActivity.this, SelectActivity.class));
                break;
            case R.id.ivBack:
                try {
                    runtime.exec("input keyevent " + KeyEvent.KEYCODE_BACK);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
    }

}
