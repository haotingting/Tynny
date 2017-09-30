package com.zjtachao.fish.tynny.activity.main;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.zjtachao.fish.tynny.R;
import com.zjtachao.fish.tynny.activity.base.TynnyBaseActivity;
import com.zjtachao.fish.tynny.activity.layout.TynnyFrameLayoutActivity;
import com.zjtachao.fish.tynny.activity.layout.TynnyLayoutActivity;

/**
 * 主要Acitviy
 */
public class MainActivity extends TynnyBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button layoutBtn = (Button)findViewById(R.id.rel_btn);

        layoutBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TynnyLayoutActivity.class);
                startActivity(intent);
            }
        });

        Button frameLayoutBtn = (Button)findViewById(R.id.frame_btn);

        frameLayoutBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , TynnyFrameLayoutActivity.class);
                startActivity(intent);
            }
        });

    }
}
