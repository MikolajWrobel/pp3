public class Email extends Message {
    
    private String address;
    private String subject;

    public Email(String address, String subject, String text){
        super(text);
        this.address = address;
        this.subject = subject;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void send() {
        // TODO Auto-generated method stub
        System.out.println("Address: " + this.getAddress() +
        "\nSubject: " + this.getSubject() + 
        "\nMessage: " + this.getText());
    }

}
