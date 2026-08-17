package com.example.layoutmanager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnLinear;
    Button btnRelative;
    Button btnConstraint;
    Button btnFrame;
    Button btnScroll;

    FrameLayout layoutContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Connect Java variables with XML views
        btnLinear = findViewById(R.id.btnLinear);
        btnRelative = findViewById(R.id.btnRelative);
        btnConstraint = findViewById(R.id.btnConstraint);
        btnFrame = findViewById(R.id.btnFrame);
        btnScroll = findViewById(R.id.btnScroll);

        layoutContainer = findViewById(R.id.layoutContainer);

        // Linear Layout button
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                layoutContainer.removeAllViews();

                getLayoutInflater().inflate(
                        R.layout.layout_linear,
                        layoutContainer,
                        true
                );
            }
        });

        // Relative Layout button
        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                layoutContainer.removeAllViews();

                getLayoutInflater().inflate(
                        R.layout.relative_layout,
                        layoutContainer,
                        true
                );
            }
        });

        // Constraint Layout button
        btnConstraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                layoutContainer.removeAllViews();

                getLayoutInflater().inflate(
                        R.layout.constraint_layout,
                        layoutContainer,
                        true
                );
            }
        });

        // Frame Layout button
        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                layoutContainer.removeAllViews();

                getLayoutInflater().inflate(
                        R.layout.frame_layout,
                        layoutContainer,
                        true
                );
            }
        });

        // Scroll View button
        btnScroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                layoutContainer.removeAllViews();

                getLayoutInflater().inflate(
                        R.layout.scrollview,
                        layoutContainer,
                        true
                );
            }
        });
    }
}