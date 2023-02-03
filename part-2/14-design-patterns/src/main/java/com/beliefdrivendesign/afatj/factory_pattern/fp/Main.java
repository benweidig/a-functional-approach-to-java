package com.beliefdrivendesign.afatj.factory_pattern.fp;

import com.beliefdrivendesign.afatj.factory_pattern.fp.Color;

public class Main {

    public static void main(String[] args) {
        var triangle = ShapeType.TRIANGLE.newInstance(Color.RED);
        System.out.println(triangle);
    }
}