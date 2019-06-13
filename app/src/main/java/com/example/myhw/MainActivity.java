package com.example.myhw;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acivity_main);
    }
    public void onLifeCycle(View view){
        Intent intent = new Intent(this ,LifeCycleActivity.class);
        startActivity(intent);
    }
    public void onScrollView(View view){
        Intent intent = new Intent(this , ScrollViewActivity.class);
        startActivity(intent);
    }
    public void onRatingBar(View view){
        Intent intent = new Intent(this ,RatingBarActivity.class);
        startActivity(intent);
    }
    public void onCompoundButton(View view){
        Intent intent = new Intent(this ,CompoundButtonActivity.class);
        startActivity(intent);
    }
    public void onSeekBar(View view){
        Intent intent = new Intent(this , SeekBarActivity.class);
        startActivity(intent);
    }
    public void onWebView(View view){
        Intent intent = new Intent(this , WebViewActivity.class);
        startActivity(intent);
    }
    public void onMenus(View view){
        Intent intent = new Intent(this , MenusActivity.class);
        startActivity(intent);
    }
    public void onSpinner(View view){
        Intent intent = new Intent(this , SpinnerActivity.class);
        startActivity(intent);
    }
}
