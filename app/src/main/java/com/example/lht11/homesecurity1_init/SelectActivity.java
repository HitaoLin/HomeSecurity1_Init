package com.example.lht11.homesecurity1_init;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import java.io.IOException;

public class SelectActivity extends AppCompatActivity {

    private Button btnCurtain,btnLight,ivBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        btnCurtain = findViewById(R.id.btn_Curtain);
        btnLight = findViewById(R.id.btn_Light);
        ivBack = findViewById(R.id.ivBack);
       /* btnCurtain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SelectActivity.this,CurtainActivity.class));
            }
        });*/
    }

    public void MyClick(View view) {
        Runtime runtime = Runtime.getRuntime();
        switch (view.getId()){
            case R.id.btn_Curtain:startActivity(new Intent(SelectActivity.this,CurtainActivity.class));
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
   /* public void MyClick(View view) {

        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec("input keyevent " + KeyEvent.KEYCODE_BACK);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/