package com.beliefdrivendesign.afatj.factory_pattern.fp.shapes;

import com.beliefdrivendesign.afatj.factory_pattern.fp.Color;
import com.beliefdrivendesign.afatj.factory_pattern.fp.ShapeType;

public class Circle extends Shape {

    public Circle(Color color) {
        super(0, color, ShapeType.CIRCLE);
    }
}
