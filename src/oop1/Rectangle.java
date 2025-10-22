package oop1;


public class Rectangle {
    int width = 10;
    int height = 20;

    static int calculateArea(int width, int height) {
        int area = calculateArea(width, height);
        System.out.println("넓이: " + area);
        return width * height;
    }

    static int calculatePerimeter(int width, int height) {
        int perimeter = calculatePerimeter(width, height);
        System.out.println("둘레: " + perimeter);
        return 2 * (width + height);
    }

    static boolean isSquare(int width, int height) {
        boolean square = isSquare(width, height);
        System.out.println("정사각형 여부: " + square);
        return width == height;
    }
}
