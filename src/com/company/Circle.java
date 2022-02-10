package com.company;

public class Circle {
    static int radius = 3;
    static double pi = Math.PI;

    public static void area() {
        double area = pi * Math.pow(radius,2);
        System.out.println("The area is: "+ area);
    }

    public static void circumference() {
        double circumference = 2 * pi * radius;
        System.out.println("The circumference is: "+circumference);
    }


}
