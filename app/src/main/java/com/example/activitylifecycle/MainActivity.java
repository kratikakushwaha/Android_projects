package com.example.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  String msg = "Android : ";
    private Button button;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The MainActivity_onCreate() event");

        textView = (TextView) findViewById(R.id.textView);
        //showing data from application class
        textView.setText(GlobalApplication.getInstance().helloFromGlobalApplication);

        button = (findViewById(R.id.button));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //send data key and value
                //sendDataUsingKeyAndValue();


                //send data using bundle
                sendDataUsingBundle();


            }
        });
    }

    private void sendDataUsingKeyAndValue() {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class)
                .putExtra("Key", "HCL");
        startActivity(intent);
    }

    private void sendDataUsingBundle() {
        Bundle bundle = new Bundle();
        String str2 = "coming through bundle";
        bundle.putString("value1", str2);
        bundle.putInt("value2", 200);
        Intent intent1= new Intent(MainActivity.this,SecondActivity.class)
                .putExtras(bundle);
        startActivity(intent1);
    }

    /** Called when the activity is about to become visible. */
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg, "The MainActivity_onStart() event");
    }

    /** Called when the activity has become visible. */
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg, "The MainActivity_onResume() event");
    }

    /** Called when another activity is taking focus. */
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg, "The MainActivity_onPause() event");
    }

    /** Called when the activity is no longer visible. */
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg, "The MainActivity_onStop() event");
    }

    /** Called just before the activity is destroyed. */
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(msg, "The MainActivity_onDestroy() event");
    }


}
