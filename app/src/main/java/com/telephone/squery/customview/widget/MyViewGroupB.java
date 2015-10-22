package com.telephone.squery.customview.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class MyViewGroupB extends LinearLayout {

    public MyViewGroupB(Context context) {
        super(context);
    }

    public MyViewGroupB(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public MyViewGroupB(Context context, AttributeSet attrs,
                        int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("xys", "ViewGroupB dispatchTouchEvent" + ev.getAction());
        boolean ret = super.dispatchTouchEvent(ev);
        Log.d("MyViewGroupB", "ret dispatch:" + ret);
        return ret;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("xys", "ViewGroupB onInterceptTouchEvent" + ev.getAction());
        boolean ret = super.onInterceptTouchEvent(ev);
        Log.d("MyViewGroupB", "ret intercepet:" + ret);
        return ret;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("xys", "ViewGroupB onTouchEvent" + event.getAction());
        boolean ret = super.onTouchEvent(event);
        Log.d("MyViewGroupB", "ret touchevent:" + ret);
        return ret;
    }
}
