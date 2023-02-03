package com.beliefdrivendesign.afatj.factory_pattern.fp.shapes;

import com.beliefdrivendesign.afatj.factory_pattern.fp.Color;
import com.beliefdrivendesign.afatj.factory_pattern.fp.ShapeType;

public class Square extends Shape {

    public Square(Color color) {
        super(4, color, ShapeType.SQUARE);
    }
}