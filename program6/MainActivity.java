package com.example.program6;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText n1,n2;
    Button sum,sub,mul,div;

    TextView re;
    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.first);
        n2 = (EditText) findViewById(R.id.second);
        sum = findViewById(R.id.sum);
        sub = findViewById(R.id.sub);
        div = findViewById(R.id.div);
        mul = findViewById(R.id.mul);

        re = findViewById(R.id.re);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double f1 = Double.parseDouble(n1.getText().toString());
                Double f2 = Double.parseDouble(n2.getText().toString());
                re.setText("Multiplication= "+ (f1 * f2));



            }
        });
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double f1 = Double.parseDouble(n1.getText().toString());
                Double f2 = Double.parseDouble(n2.getText().toString());
                re.setText("sum= "+ (f1 + f2));



            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double f1 = Double.parseDouble(n1.getText().toString());
                Double f2 = Double.parseDouble(n2.getText().toString());
                re.setText("Division= "+ (f1 / f2));



            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double f1 = Double.parseDouble(n1.getText().toString());
                Double f2 = Double.parseDouble(n2.getText().toString());
                re.setText("Subtraction= "+ (f1 - f2));



            }
        });
    }
}
