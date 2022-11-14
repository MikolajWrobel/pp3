class Counter {
    
    int counter = 0;
    
    
    public void increase1(){
        counter += 1;
    }
    
    public void decrease1(){
        counter -= 1;
    }
    
    public void counterReset(){
        counter = 0;
    }
    
    public void increase10(){
        counter += 10;
    }
    
    public void decrease10(){
        counter -= 10;
    }
    
    public void counterStatus(){
        System.out.println("Counter status: " + counter);
    }
    public static void main(String[] args){
        Counter a = new Counter();
        a.increase10();
        a.increase10();
        a.increase1();
        a.increase1();
        a.increase1();
        a.counterStatus();
}
}
