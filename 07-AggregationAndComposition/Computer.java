import javax.annotation.processing.Processor;

public class Computer {
    
    private String GPU;
    private String motherboard;
    private int RAM;
    private boolean isOn;
    Processor processor;
    

    public Computer(String GPU, String motherboard, int RAM, Processor processor){
        this.GPU = GPU;
        this.motherboard = motherboard;
        this.RAM = RAM;
        this.processor = processor;
    }

    public void wlaczKomputer(){
        isOn = true;
    }

    public void wylaczKomputer(){
        isOn = false;
    }

    public void uruchomProgram(String program){

    }


}
