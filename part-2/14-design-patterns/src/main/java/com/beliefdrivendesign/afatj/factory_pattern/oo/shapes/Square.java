package com.beliefdrivendesign.afatj.factory_pattern.oo.shapes;

import com.beliefdrivendesign.afatj.factory_pattern.oo.Color;
import com.beliefdrivendesign.afatj.factory_pattern.oo.ShapeType;

public class Square extends Shape {

    public Square(Color color) {
        super(4, color, ShapeType.SQUARE);
    }
}