package com.beliefdrivendesign.afatj.factory_pattern.fp.shapes;

import com.beliefdrivendesign.afatj.factory_pattern.fp.Color;
import com.beliefdrivendesign.afatj.factory_pattern.fp.ShapeType;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(3, color, ShapeType.TRIANGLE);
    }
}