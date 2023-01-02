public class Triangle extends Shape {
    
    private double a, b, c;
    private double h;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

   @Override
   public double area() {
       // TODO Auto-generated method stub
       return (a*h)/2;
   }

    public double perimeter(){
        return a+b+c;
    }
}
