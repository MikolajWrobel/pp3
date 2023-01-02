public class SMS extends Message{
    
    String phoneNumber;

    public SMS(String text, String phoneNumber){
        super(text);
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send() {
        // TODO Auto-generated method stub
        System.out.println("Phone number: " + phoneNumber +
        "\nMessage: " + this.getText());
    }


}
