class SurfaceArea {
    
    static double pi = 3.14;
    
    public static double circleArea(double rad){
        return rad * rad * pi;
    }
    
    public static double rectangleArea(double length, double width){
        return length * width;
    }
    
    public static double triangleArea(double a, double h){
        return (a * h)/2;
    } 
    
}
