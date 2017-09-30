package com.zjtachao.fish.tynny.activity.layout;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

import com.zjtachao.fish.tynny.R;
import com.zjtachao.fish.tynny.activity.base.TynnyBaseActivity;
import com.zjtachao.fish.tynny.view.layout.LayoutTouchView;

/**
 *
 */
public class TynnyFrameLayoutActivity extends TynnyBaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tynny_frame_layout);

        FrameLayout frame = (FrameLayout)findViewById(R.id.frame_layout);
        final LayoutTouchView layoutTouchView = new LayoutTouchView(this);
        layoutTouchView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                float x = event.getX()-200;
                layoutTouchView.bitmapX = x;
                float y = event.getY()-250;
                layoutTouchView.bitmapY = y;
                layoutTouchView.invalidate();
                return true;
            }
        });
        frame.addView(layoutTouchView);
    }
}
