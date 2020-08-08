package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    TextView txtView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);

        String tag;
        String msg;
        Log.i( tag ="Lifecycle", msg ="onCreate() invoked");
    }
    public void onStart(){
        super.onStart();
        String tag;
        String msg;
        Log.i( tag ="Lifecycle", msg ="onStart() invoked");
    }
    public void onRestart(){
        super.onRestart();
        String tag;
        String msg;
        Log.i( tag ="Lifecycle", msg ="onRestart() invoked");
    }
    public void onResume(){
        super.onResume();
        String tag;
        String msg;
        Log.i( tag ="Lifecycle", msg ="onResume() invoked");
    }
    public void onPause(){
        super.onPause();
        String tag;
        String msg;
        Log.i( tag ="Lifecycle", msg ="onPause() invoked");
    }
    public void onStop(){
        super.onStop();
        String tag;
        String msg;
        Log.i( tag ="Lifecycle", msg ="onStop() invoked");
    }
    public void onDestroy(){
        super.onDestroy();
        String tag;
        String msg;
        Log.i( tag ="Lifecycle", msg ="onDestroy() invoked");
    }

}