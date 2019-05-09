package com.example.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private  String msg = "Android : ";
    private TextView textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView2 = (TextView)findViewById(R.id.textView2);

        Log.d(msg, "The SecondActivity_onCreate() event");
        //get Data from Key
        //getDataFromKey();

        //get Data From bundle
        getDataFromBundle();
    }

    private void getDataFromBundle() {
        Intent intent = getIntent();

        Bundle b = getIntent().getExtras();

        String str2 = b.getString("value1", "");

        int int2 = b.getInt("value2");
        textView2.setText("showing Data From Bundle===="+str2+"=="+int2);
    }

    private void getDataFromKey() {
        Intent intent = getIntent();
        String str = intent.getStringExtra("Key");
        textView2.setText("showing Data From Key===="+str);

    }

    /** Called when the activity is about to become visible. */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The SecondActivity_onStart() event");
    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "The SecondActivity_onResume() event");
    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "The SecondActivity_onPause() event");
    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The SecondActivity_onStop() event");
    }

    /** Called just before the activity is destroyed. */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The SecondActivity_onDestroy() event");
    }
}
