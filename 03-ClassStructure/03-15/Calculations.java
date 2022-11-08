class Calculations {
    int x;
    int y;
    int z;
    int f;
    
    public int NumberOfItems(){
        if (x>=y){
            return x - y + 1;
        }
        else {
            return y - x + 1;
        }
    }
    
    public int SumOfNumbers(){
            for (int z = x; z<=y; z++) {
            f += z;
        }
        return f;
    }
    
    public double ArithmeticMean(){
        return SumOfNumbers() / NumberOfItems();
    }
    
    public void ShowResults(){
        System.out.println("Given range: <" + x + "," + y + ">" +
        "\nNumber of items: " + NumberOfItems() +
        "\nSum of numbers: " + SumOfNumbers() +
        "\nArithmetic mean: " + ArithmeticMean() );
    }
    
    public Calculations(int first, int second){
        x = first;
        y = second;
        ShowResults();
    }
    public static void main(String[] args){
        Calculations c1 = new Calculations(3,5);
    }
    
    
    
}
