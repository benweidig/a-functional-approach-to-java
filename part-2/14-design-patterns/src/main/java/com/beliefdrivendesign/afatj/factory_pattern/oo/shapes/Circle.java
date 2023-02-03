package com.beliefdrivendesign.afatj.factory_pattern.oo.shapes;

import com.beliefdrivendesign.afatj.factory_pattern.oo.Color;
import com.beliefdrivendesign.afatj.factory_pattern.oo.ShapeType;

public class Circle extends Shape {

    public Circle(Color color) {
        super(0, color, ShapeType.CIRCLE);
    }
}
