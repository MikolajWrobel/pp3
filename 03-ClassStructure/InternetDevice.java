public class InternetDevice {

    String name;
    boolean connected;
    static int connectedDevices;

    public InternetDevice(String name){
        this.name = name;
    }

    public boolean connect(){
        connectedDevices += 1;
        return connected == true;
    }

    public boolean disconnect(){
        connectedDevices -= 1;
        return connected == false; 
    }

    public boolean isConnected(){
        return connected;
    }

    public void displayStatus(){
        System.out.println("Device: " + name +
        "\nConnected: " + isConnected() + "\n");
        
    }

    public static void displayConnections(){
        

        }
    


    public static void main(String args[]){
        InternetDevice i1 = new InternetDevice("Kąkuter");
        i1.connect();
        i1.displayStatus();
    }

}