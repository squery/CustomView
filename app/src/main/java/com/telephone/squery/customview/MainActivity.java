package com.telephone.squery.customview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.telephone.squery.customview.adapter.ListViewAdapter;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * ListView嵌套GridView使用详解
 * 即ListView的每个Item中都包含一个GridView
 *
 * 注意事项:
 * 由于ListView和GridView都是可滑动的控件.
 * 所以需要自定义GridView,重写其onMeasure()方法. 这里没有事件冲突
 * 在该方法中使GridView的高为wrap_content的大小,否则GridView中的内容只能显示很小一部分
 *
 */
public class MainActivity extends Activity {

    ListView mListView;
    private ArrayList<ArrayList<HashMap<String, Object>>> mArrayLists;
    private ListViewAdapter mListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init() {
        mListView = (ListView) findViewById(R.id.list_view);
        initData();
        mListViewAdapter = new ListViewAdapter(mArrayLists, MainActivity.this);
        mListView.setAdapter(mListViewAdapter);
    }

    private void initData() {
        mArrayLists = new ArrayList<>();
        HashMap<String, Object> hashMap = null;
        ArrayList<HashMap<String, Object>> arrayListForEveryGridView;

        for (int i = 0; i < 10; i++) {
            arrayListForEveryGridView = new ArrayList<HashMap<String, Object>>();
            for (int j = 0; j < 6; j++) {
                hashMap = new HashMap<String, Object>();
                hashMap.put("content", "i=" + i + " ,j=" + j);
                arrayListForEveryGridView.add(hashMap);
            }
            mArrayLists.add(arrayListForEveryGridView);
        }
    }

}
