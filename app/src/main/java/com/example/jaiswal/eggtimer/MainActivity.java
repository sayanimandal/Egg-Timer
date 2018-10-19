package com.example.jaiswal.eggtimer;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView timerTextView=findViewById(R.id.timerTextView);
    Handler handler = new Handler();

    public static void onGo(View view){
        view.setVisibility(View.INVISIBLE);

    }

    public static void onStop(View view){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
