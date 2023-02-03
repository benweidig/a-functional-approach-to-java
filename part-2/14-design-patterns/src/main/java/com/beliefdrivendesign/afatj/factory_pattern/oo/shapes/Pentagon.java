package com.beliefdrivendesign.afatj.factory_pattern.oo.shapes;

import com.beliefdrivendesign.afatj.factory_pattern.oo.Color;
import com.beliefdrivendesign.afatj.factory_pattern.oo.ShapeType;

public class Pentagon extends Shape {

    public Pentagon(Color color) {
        super(5, color, ShapeType.PENTAGON);
    }
}