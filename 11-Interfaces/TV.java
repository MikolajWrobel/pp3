public class TV implements CanOnOff {
    
    private boolean isOn;


    @Override
    public void on(){
        isOn = true;
    }
    @Override
    public void off(){
        isOn = false;
    }

    public void turnOn(){
        this.on();
    }
    public void turnOff(){
        this.off();
    }

    public void displayStatus(){
        if (isOn){
            System.out.println("TV is on");
        } else {
            System.out.println("TV is off");
        }
    }
}
