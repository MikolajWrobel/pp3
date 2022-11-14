class Lamp{
    //Atrybuty
    boolean lightStatus;
    
    //Zachowania
    public void changeStatus(){
        lightStatus = !lightStatus;
    }
    public void checkStatus(){
        if (lightStatus == true) {
            System.out.println("Lamp is on");
        }
        else {
           System.out.println("Lamp is off"); 
        }
    }
    public static void main(String[] args){
        Lamp l1 = new Lamp();
        l1.lightStatus = false;
        l1.checkStatus();
        l1.changeStatus();
        l1.checkStatus();
    }
}