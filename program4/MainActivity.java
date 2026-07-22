package com.example.validation;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2, ep;
    RadioGroup rg;
    Spinner sp;
    CheckBox ch;
    Button b;

    String[] country = {"Select Country", "India", "USA", "UK", "Canada"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.editTextText);
        e2 = findViewById(R.id.editTextText2);
        ep = findViewById(R.id.editTextText3);
        rg = findViewById(R.id.radioGroup2);
        sp = findViewById(R.id.spinner);
        ch = findViewById(R.id.checkBox);
        b = findViewById(R.id.button);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                country
        );

        sp.setAdapter(adapter);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = e1.getText().toString().trim();
                String email = e2.getText().toString().trim();
                String password = ep.getText().toString().trim();

                if (name.isEmpty()) {
                    e1.setError("enter name");
                    return;
                }
                if (email.isEmpty()) {
                    e2.setError("enter email");
                    return;
                }
                if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    e2.setError("Invalid Email");
                    return;
                }
                if (password.length() < 8) {
                    ep.setError("Password must be at least 8 characters");
                    return;
                }
                if (rg.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(MainActivity.this, "Select Gender", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (sp.getSelectedItemPosition() == 0) {
                    Toast.makeText(MainActivity.this, "Select Country", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!ch.isChecked()) {
                    Toast.makeText(MainActivity.this, "Accept Terms and Conditions", Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(MainActivity.this, "Validation Successful", Toast.LENGTH_SHORT).show();


            }
        });

    }
}
