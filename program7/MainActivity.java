package com.example.program7;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.program7.R;

public class MainActivity extends AppCompatActivity {
    ImageView image1, image2;
    ToggleButton btnToggle;
    boolean isFirstImage = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1 = findViewById(R.id.imageView);
        image2 = findViewById(R.id.imageView2);
        btnToggle = findViewById(R.id.tb);
        btnToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFirstImage) {
                    image1.setVisibility(View.GONE);
                    image2.setVisibility(View.VISIBLE);
                } else {
                    image1.setVisibility(View.VISIBLE);
                    image2.setVisibility(View.GONE);
                }
                isFirstImage = !isFirstImage;

            }
        });
    }
}

