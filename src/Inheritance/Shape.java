package Inheritance;

abstract class Shape {
    abstract double area();

}
class Circle extends Shape {
    private double radius;
    Circle(double radius){
        this.radius=radius;
    }
    @Override
    double area(){
        return radius*radius;
    }
}

