package com.example.shaperecognitiongame.shapes;

import com.example.shaperecognitiongame.R;

public class Circle implements Shape {
    @Override
    public double minCos() {
        return 0;
    }

    @Override
    public double maxCos() {
        return 0;
    }

    @Override
    public int numberOfVertices() {
        return 0;
    }

    @Override
    public int imageResource() {
        return R.mipmap.circle;
    }
}
