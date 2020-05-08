package com.example.harwin.androidpratice;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerTitleStrip;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Size;
import android.util.TypedValue;
import android.widget.Toast;

public class CustomPagerTitleStrip extends PagerTitleStrip {

    private int textColor = Color.RED;
    private int textSize = 35;

    public CustomPagerTitleStrip(@NonNull Context context) {
        super(context);
    }

    public CustomPagerTitleStrip(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

    }
}
