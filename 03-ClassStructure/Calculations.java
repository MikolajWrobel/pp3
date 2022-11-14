import java.util.Random;

public class Calculations {

    private int x;
    private int y;
    private int counter1;
    private int counter2;
    public int[] z = {1,2,3,4,5,6};

    public int numberOfItems(){
        counter1 = 0;
        for (int i=x; i<=y; i++){
            counter1 += 1;
        }
        return counter1;
    }

    public int sumOfNumbers(){
        counter2 = 0;
        for (int i=x; i<=y; i++){
            counter2 += i;
        }

        return counter2;
    }

    public double arithmeticMean(){
        double d1 = counter1;
        double d2 = counter2;
        return d2 / d1;
    }

    public void showResults(){
        System.out.println("Given range: " + x + ", " + y +
        "\nNumber of items: " + numberOfItems() + 
        "\nSum of numbers: " + sumOfNumbers() + 
        "\nArithmetic mean: " + arithmeticMean() +
        "\nRandom grade: " + getRandom());
    }

    public Calculations(int x, int y){
        this.x = x;
        this.y = y;
        
        showResults();
    }

    public int getRandom() {
        int rnd = new Random().nextInt(z.length);
        return z[rnd];
    }

    public static void main(String[] args){
        Random random = new Random();
        Calculations c1 = new Calculations(1, 2);
    

    }

}
