package com.beliefdrivendesign.afatj.factory_pattern.oo;

public class Main {
    public static void main(String[] args) {
        var triangle = ShapeFactory.newShape(ShapeType.TRIANGLE, Color.RED);

        System.out.println(triangle);
    }
}