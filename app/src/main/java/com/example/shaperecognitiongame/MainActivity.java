package com.example.shaperecognitiongame;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.shaperecognitiongame.shapes.ShapeHelper;

public class MainActivity extends AppCompatActivity {
    public static final String VERTICES_EXTRA = "vertices_extra";
    public static final int NEW_GAME_REQUEST = 100;

    private int mVertices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chooseNewShape();

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CvCameraActivity.class);
                intent.putExtra(VERTICES_EXTRA, mVertices);
                startActivityForResult(intent, NEW_GAME_REQUEST);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == NEW_GAME_REQUEST) {
            chooseNewShape();
        }
    }

    private void chooseNewShape() {
        mVertices = ShapeHelper.getRandomShape().numberOfVertices();

        int shapeImage = ShapeHelper.getImageResource(mVertices);
        ImageView imageView = findViewById(R.id.imageView);
        imageView.setImageResource(shapeImage);
    }
}
