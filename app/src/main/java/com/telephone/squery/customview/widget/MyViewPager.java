package com.telephone.squery.customview.widget;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;

/**
 * Created by ${ZhangYan}[Squery] on 2015/10/22.
 */

/**
 * 这个类主要是解决 ListView  + ViewPager 的冲突
 * 冲突描述： 当斜着滑动ViewPager的时候会触发 ListView的下拉刷新
 * 当 action_down 的时候 父控件是没有拦截的  传递到子view了
 * 这个时候 让父类不拦截move事件 getParent().requestDisallowInterceptTouchEvent(true);
 * move事件就可以传递到子View了 就可以让 down后的几个action了
 */
public class MyViewPager extends ViewPager {
    private ViewGroup parent;

    public MyViewPager(Context context) {
        super(context);
    }

    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent arg0) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(arg0);
    }

    @Override
    public boolean onTouchEvent(MotionEvent arg0) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(arg0);
    }

    public void setNestedpParent(ViewGroup parent) {
        this.parent = parent;
    }
}
