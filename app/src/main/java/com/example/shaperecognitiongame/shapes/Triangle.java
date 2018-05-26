package com.example.shaperecognitiongame.shapes;

public class Triangle implements Shape {
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
        return 3;
    }
}
