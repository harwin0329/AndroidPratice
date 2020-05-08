package com.example.harwin.androidpratice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.View;

public class CustonLinearLayoutCompat extends LinearLayoutCompat {
//    public CustonLinearLayoutCompat(Context context) {
//        super(context);
//    }

    public CustonLinearLayoutCompat(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

//    public CustonLinearLayoutCompat(Context context, AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        for (int i = 0; i < getChildCount(); i++) {
            View child = getChildAt(i);
            child.layout(100,100,child.getMeasuredWidth(),child.getMeasuredHeight());
        }

    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.YELLOW);
        paint.setStrokeWidth(10);

        Rect rect = new  Rect(1,1,100,100);
//        canvas.drawRect(rect,paint);
        RectF rectF = new RectF(1,1,100,200);
        canvas.drawOval(rectF,paint);
        super.onDraw(canvas);

    }
}
