package com.example.shaperecognitiongame.shapes;

import com.example.shaperecognitiongame.R;

public final class ShapeHelper {
    private static Shape[] shapes = new Shape[]{
            new Circle(),
            new Triangle(),
            new Rectangle(),
            new Pentagon(),
            new Hexagon()
    };

    private ShapeHelper() {
        throw new UnsupportedOperationException();
    }

    public static Shape getShape(int vertices) {
        switch (vertices) {
            case 3:
                return shapes[1];
            case 4:
                return shapes[2];
            case 5:
                return shapes[3];
            case 6:
                return shapes[4];
            default:
                return shapes[0];
        }
    }

    public static int getImageResource(int vertices) {
        switch (vertices) {
            case 3:
                return R.mipmap.triangle;
            case 4:
                return R.mipmap.rectangle;
            case 5:
                return R.mipmap.pentagon;
            default:
                return R.mipmap.circle;
        }
    }
}
