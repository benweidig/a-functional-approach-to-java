package com.beliefdrivendesign.afatj.factory_pattern.oo.shapes;

import com.beliefdrivendesign.afatj.factory_pattern.oo.Color;
import com.beliefdrivendesign.afatj.factory_pattern.oo.ShapeType;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(3, color, ShapeType.TRIANGLE);
    }
}