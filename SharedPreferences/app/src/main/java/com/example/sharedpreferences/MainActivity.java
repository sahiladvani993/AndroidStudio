package com.example.sharedpreferences;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declare UI components
    EditText edtName;
    Button btnSave, btnDisplay;
    TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // Connect Java with XML
        setContentView(R.layout.activity_main);


        // Connect EditText
        edtName = findViewById(R.id.edtName);

        // Connect Save Button
        btnSave = findViewById(R.id.btnSave);

        // Connect Display Button
        btnDisplay = findViewById(R.id.btnDisplay);

        // Connect TextView
        txtResult = findViewById(R.id.txtResult);


        // ==============================
        // SAVE DATA
        // ==============================

        btnSave.setOnClickListener(v -> {

            // Get name entered by user
            String name = edtName.getText().toString();


            // Open/Create SharedPreferences
            getSharedPreferences("StudentData", MODE_PRIVATE)

                    // Open editor
                    .edit()

                    // Store name
                    .putString("student_name", name)

                    // Save changes
                    .apply();


            // Display confirmation
            txtResult.setText("Data Saved");

        });


        // ==============================
        // RETRIEVE DATA
        // ==============================

        btnDisplay.setOnClickListener(v -> {

            // Retrieve saved name
            String name = getSharedPreferences(
                    "StudentData",
                    MODE_PRIVATE
            ).getString(
                    "student_name",
                    "No Data Found"
            );


            // Display name
            txtResult.setText("Student Name: " + name);

        });
    }
}