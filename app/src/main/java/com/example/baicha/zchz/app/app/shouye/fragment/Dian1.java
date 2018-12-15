package com.example.baicha.zchz.app.app.shouye.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.baicha.zchz.R;

public class Dian1 extends Activity {
    private ImageView imageView;
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dian1);
        imageView = findViewById(R.id.fanhui);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
