package org.example;

public class Triangle {

    private int a;
    private int b;
    private int c;

    public static String sideTriangle(int a, int b, int c) {
        if(a + b <= c || a + c <= b || b + c <= a || a <= 0 || b <= 0 || c <= 0) {
            return "Not a triangle";
        } else if(a == b && b == c) {
            return "Equilateral Triangle";
        } else if(a == b || b == c || a == c) {
            return "Isosceles Triangle";
        } else {
            return "Scalene Triangle";
        }
    }
}
