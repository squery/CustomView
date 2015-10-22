package com.telephone.squery.customview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

public class MyView extends View {

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs,
                  int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("xys", "View onTouchEvent" + event.getAction());
        boolean ret = super.onTouchEvent(event);
        Log.d("View", "ret touchevent:" + ret);
        return ret;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d("xys", "View dispatchTouchEvent" + event.getAction());
        boolean ret = super.dispatchTouchEvent(event);
        Log.d("View", "ret dispatch:" + ret);
        return ret;
    }

}
