public class Processor {

    private String nazwa;
    private double taktowanie;
    private int liczbaRdzeni;
    private String socket;

    public Processor(String nazwa, double taktowanie, int liczbaRdzeni, String socket){
        this.nazwa = nazwa;
        this.taktowanie = taktowanie;
        this.liczbaRdzeni = liczbaRdzeni;
        this.socket = socket;
    }


    public double sumujLiczby(double a, double b){
        return a + b;
    }

    public double odejmijLiczby(double a, double b){
        return a - b;
    }

    public double pomnozLiczby(double a, double b){
        return a * b;
    }

    public double dzielLiczby(double a, double b){
        return a / b;
    }

    public String toString(){
        String processorData = "";
        processorData = nazwa + taktowanie + liczbaRdzeni + socket;
        return processorData;  
    }

}
