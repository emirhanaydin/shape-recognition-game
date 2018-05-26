package com.example.shaperecognitiongame.shapes;

public class Hexagon implements Shape {
    @Override
    public double minCos() {
        return -0.55;
    }

    @Override
    public double maxCos() {
        return -0.45;
    }

    @Override
    public int numberOfVertices() {
        return 6;
    }
}
