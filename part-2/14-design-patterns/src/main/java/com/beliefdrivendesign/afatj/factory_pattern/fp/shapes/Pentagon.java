package com.beliefdrivendesign.afatj.factory_pattern.fp.shapes;

import com.beliefdrivendesign.afatj.factory_pattern.fp.Color;
import com.beliefdrivendesign.afatj.factory_pattern.fp.ShapeType;

public class Pentagon extends Shape {

    public Pentagon(Color color) {
        super(5, color, ShapeType.PENTAGON);
    }
}