package com.example.program12;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    Spinner s;
    TextView t2;

    String[] courses= {"Select your course","BCA","MCA","BBA","MBA","BTECH","MTECH","BSC","MSC"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        s=findViewById(R.id.spinner);
        t1=findViewById(R.id.textView2);
        t2=findViewById(R.id.textView3);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,courses);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
        s.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, android.view.View view, int position, long id) {
                String selectedCourse=(courses[position]);
                t2.setText("Selected Course:"+selectedCourse);
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                t2.setText("No course selected");
            }

        });
    }
}
