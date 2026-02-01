package Polymorphism;

public class ShapePolymorphic {
    double area (int side) {
        return side * side;
    }
        int area (int len , int breadth ){
            return len * breadth;}

    float area (int height , float base ){
            return (int) (0.5f * height * base);
    }

    double area(float radius ){
            return (int) (Math.PI * radius * radius);
    }
    float area(float base , int height ){
            return base * height ;
    }
    }
