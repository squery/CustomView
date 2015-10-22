package com.telephone.squery.customview;

import android.app.Activity;
import android.os.Bundle;


/**
 * 这是关于事件拦截的打印情况
 *
 * 注意：
 * 1. 当dispatchTouchEvent 返回true表示拦截 自己处理  返回false表示不拦截
 * 2. 执行顺序 是执行最外层的dispathchTouchEvent 里面调到内层的dispatchTouchEvent
 * 3. 具体看图结合代码
 */
public class TestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

}
