package Polymorphism;

public class Main {
    public static void main(String[] args){
        System.out.println();
        ShapePolymorphic ShapePolymorphic = new ShapePolymorphic();
        System.out.println(ShapePolymorphic.area( 0.5f,  8));
        System.out.println(ShapePolymorphic.area( 10.0f));
        System.out.println(ShapePolymorphic.area( 8));
        System.out.println(ShapePolymorphic.area(0.5f,  8));
    }
}
