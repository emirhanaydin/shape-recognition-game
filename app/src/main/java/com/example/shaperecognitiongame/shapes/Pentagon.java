package com.example.shaperecognitiongame.shapes;

import com.example.shaperecognitiongame.R;

public class Pentagon implements Shape {
    @Override
    public double minCos() {
        return -0.34;
    }

    @Override
    public double maxCos() {
        return -0.27;
    }

    @Override
    public int numberOfVertices() {
        return 5;
    }

    @Override
    public int imageResource() {
        return R.mipmap.pentagon;
    }
}
