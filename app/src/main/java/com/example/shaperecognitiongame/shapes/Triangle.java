package com.example.shaperecognitiongame.shapes;

public class Triangle implements Shape {
    @Override
    public double minCos() {
        return Double.MIN_VALUE;
    }

    @Override
    public double maxCos() {
        return Double.MAX_VALUE;
    }

    @Override
    public int numberOfVertices() {
        return 3;
    }
}
