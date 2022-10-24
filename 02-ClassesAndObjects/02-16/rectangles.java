class rectangles {
    
    //Atrybuty
    int length;
    int width;
    String dimension;
    int perimeter;
    int surfaceArea;
    
    //Zachowania
    public void calculations(){
        dimension = length + "x" + width;
        perimeter = 2 * length + 2 * width;
        surfaceArea = length * width;
    }
    
    public void displayResults(){
        System.out.println("Rectangle: " + dimension);
        System.out.println("Its perimeter: " + perimeter);
        System.out.println("Its Surface Area: " + surfaceArea);
    }
    
    public static void main(String[] args){
        rectangles r1 = new rectangles();
        rectangles r2 = new rectangles();
        
        r1.length = 3;
        r1.width = 4;
        
        r2.length = 2;
        r2.width = 7;
        
        r1.calculations();
        r2.calculations();
        
        r1.displayResults();
        r2.displayResults();
    }
}
