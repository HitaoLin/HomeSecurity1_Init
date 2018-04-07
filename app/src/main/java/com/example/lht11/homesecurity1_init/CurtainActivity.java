package com.example.lht11.homesecurity1_init;


import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;


import java.io.IOException;

import static com.example.lht11.homesecurity1_init.R.*;
import static com.example.lht11.homesecurity1_init.R.drawable.ic_on;

public class CurtainActivity extends AppCompatActivity {
    private ImageView ivCurtain;
    private CheckBox cbCurtain;
    private AnimationDrawable animationiv;
    private Button ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_curtain);
        // 绑定控件
        bindView();
        // 初始化数据
        initData();
        // 事件监听
        initEvent();
    }

    private void bindView() {
        ivCurtain = (ImageView) findViewById(id.ivCurtain);
        cbCurtain = (CheckBox) findViewById(id.cbCurtain);
        ivBack = findViewById(id.ivBack);
    }

    private void initData() {
    }

    private void initEvent() {

       /* cbCurtain.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean check) {
                if (check) {
                    ivCurtain.setBackgroundResource(R.drawable.ic_on);
                    animationiv = (AnimationDrawable) ivCurtain.getBackground();
                    animationiv.start();

                } else {
                    ivCurtain.setBackgroundResource(R.drawable.ic_off);
                    animationiv = (AnimationDrawable) ivCurtain.getBackground();
                    animationiv.start();
                }
            }
        });*/
        cbCurtain.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    ivCurtain.setBackgroundResource(R.drawable.ic_on);
                    animationiv = (AnimationDrawable) ivCurtain.getBackground();
                    animationiv.start();

                } else {
                    ivCurtain.setBackgroundResource(R.drawable.ic_off);
                    animationiv = (AnimationDrawable) ivCurtain.getBackground();
                    animationiv.start();
                }
            }
        });
    }

    public void MyClick(View view) {
        Runtime runtime = Runtime.getRuntime();
        switch (view.getId()) {
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