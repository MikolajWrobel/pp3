public class Circle extends Shape{
    
    double pi = 3.14;
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return pi*radius*radius;
    }

    public double perimeter(){
        return 2*pi*radius;
    }

    
}
