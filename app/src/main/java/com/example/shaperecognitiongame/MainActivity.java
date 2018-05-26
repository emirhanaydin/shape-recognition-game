package com.example.shaperecognitiongame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.shaperecognitiongame.shapes.ShapeHelper;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public static final String VERTICES_EXTRA = "vertices_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();
        final int vertices = random.nextInt(6);

        int shapeImage = ShapeHelper.getImageResource(vertices);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(shapeImage);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CvCameraActivity.class);
                intent.putExtra(VERTICES_EXTRA, vertices);
                startActivity(intent);
            }
        });
    }
}
