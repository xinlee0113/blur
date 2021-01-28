package com.lixin.customwidget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * @author lixin
 * @date 2021/1/28.
 */
class CustView extends RelativeLayout {

    private float ringWidth;
    private Paint paint;

    public CustView(Context context) {
        this(context, null);
    }

    public CustView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initAttrs(context, attrs);
    }

    private void initAttrs(Context context, AttributeSet attrs) {
        @SuppressLint("Recycle") TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustView);
        ringWidth = typedArray.getDimension(R.styleable.CustView_ringWidth, 5);
    }


}
