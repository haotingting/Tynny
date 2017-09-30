package com.zjtachao.fish.tynny.view.layout;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import com.zjtachao.fish.tynny.R;

/**
 * Created by duhao on 2017/9/30.
 */

public class LayoutTouchView extends View {

    //开始横坐标
    public float bitmapX;
    //开始纵坐标
    public float bitmapY;

    public LayoutTouchView(Context context){
        super(context);
        bitmapX = 0;
        bitmapY = 200;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //创建和实例化Paint对象
        Paint paint = new Paint();
        //根据图片生成位图对象
        Bitmap bitmap = BitmapFactory.decodeResource(this.getResources(), R.drawable.s_jump);
        //绘制萌妹子
        canvas.drawBitmap(bitmap,bitmapX,bitmapY,paint);
        if(bitmap.isRecycled()){
            bitmap.recycle();
        }
    }
}
