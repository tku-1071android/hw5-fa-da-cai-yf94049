package com.example.myhw;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class LifeCycleActivity extends Activity {
    private final static String TAG = "LifeCycle";
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lifecycle);
        Log.d(TAG ,"onCreate");
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG ,"onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG ,"onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG ,"onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG ,"onStop");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG ,"onRestart");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG ,"onDestroy");
    }
    public void onFinishClick(View v){
        finish();
    }
}
