package com.example.activitylifecycleusinglogcat;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.graphics.Color;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LifeCycle_App";

    TextView statusText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        statusText = findViewById(R.id.statusText);

        updateStatus("🚀 App Created\nWelcome to Lifecycle Demo!");

        Log.d(TAG, "onCreate() - App Created");
    }


    @Override
    protected void onStart() {
        super.onStart();

        updateStatus("👀 App Started\nNow visible to user");

        Log.d(TAG, "onStart() - App Visible");
    }


    @Override
    protected void onResume() {
        super.onResume();

        updateStatus("😊 App Resumed\nUser can interact");

        Log.d(TAG, "onResume() - App Active");
    }


    @Override
    protected void onPause() {
        super.onPause();

        updateStatus("⏸ App Paused\nTaking a short break");

        Log.d(TAG, "onPause() - App Paused");
    }


    @Override
    protected void onStop() {
        super.onStop();

        Log.d(TAG, "onStop() - App Hidden");
    }


    @Override
    protected void onRestart() {
        super.onRestart();

        updateStatus("🔄 App Restarted\nWelcome Back!");

        Log.d(TAG, "onRestart() - App Restarting");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d(TAG, "onDestroy() - App Destroyed");
    }


    private void updateStatus(String message) {

        statusText.setText(message);
        statusText.setTextColor(Color.BLUE);
    }
}