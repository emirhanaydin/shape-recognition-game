package com.example.shaperecognitiongame.shapes;

import com.example.shaperecognitiongame.R;

public class Rectangle implements Shape {
    @Override
    public double minCos() {
        return -0.1;
    }

    @Override
    public double maxCos() {
        return 0.3;
    }

    @Override
    public int numberOfVertices() {
        return 4;
    }

    @Override
    public int imageResource() {
        return R.mipmap.rectangle;
    }
}
