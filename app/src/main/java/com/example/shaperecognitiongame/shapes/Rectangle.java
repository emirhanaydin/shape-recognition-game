package com.example.shaperecognitiongame.shapes;

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
}
