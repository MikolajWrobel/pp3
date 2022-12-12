public class Car extends Vehicle {

    private int maxSpeed;

    public Car(int seats, int maxSpeed){
        super(seats);
        this.maxSpeed = maxSpeed;

    }

    public int[] spec(){
        int[] array = {0,0};
        array[0] = this.getSeats();
        array[1] = this.maxSpeed;

        return array;
    }
    

    public static void main(String[] args) {
        Car c1 = new Car(5,200);
        System.out.println(c1.spec());
    }
}
