package com.example.shaperecognitiongame.shapes;

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
}
