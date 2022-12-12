public class SuperCounter extends Counter {

    public SuperCounter(int c){
        super(c);
    }

    public void addN(int n){
        for(int i=0;i<n;i++){
            this.add1();
        }
    }
    

    public static void main(String[] args) {
        SuperCounter s1 = new SuperCounter(0);
        s1.addN(5);
        s1.add1();
        System.out.println(s1.getCounter());
    }
    }
