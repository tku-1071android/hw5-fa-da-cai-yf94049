package com.example.myhw;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class ScrollViewActivity extends Activity {
    private TextView tvCount;
    private ScrollView scrollView;
    private LinearLayout linearLayout;
    private int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrollview);
        findViews();
        tvCount.setText(String.valueOf(count));
    }
    private void findViews() {
        tvCount = (TextView) findViewById(R.id.tvCount);
        scrollView = (ScrollView) findViewById(R.id.scrollView);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
    }
    public void onAddClick(View view){
        count ++;
        tvCount.setText(String.valueOf(count));

        TextView textView = new TextView(this);
        textView.setText(String.valueOf(count));
        linearLayout.addView(textView);

        scrollView.post(new Runnable(){
            @Override
            public void run(){
                scrollView.fullScroll(View.FOCUS_DOWN);
            }
        });
    }
}
