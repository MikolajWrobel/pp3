public class Counter {

    private int counter = 0;

    public int increase(){
        return counter += 1;
    }
    public int decrease(){
        return counter -= 1;
    }

    public int increase(int n){
        return counter += n;
    }
    public int decrease(int n){
        return counter -= n;
    }

    public int value(){
        return counter;
    }


}