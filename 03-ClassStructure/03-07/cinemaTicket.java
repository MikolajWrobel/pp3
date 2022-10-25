class cinemaTicket {
    
    static String cinemaName = "Morning Star Cinema";
    String filmTitle;
    int row;
    int seat;
    int price;
    
    public double calculatePrice(){
        if (row < 3) {
            price = 10;
        }
        else {
            price = 25;
        }
        return price;
    }
    public void ticketData(){
        System.out.println("Cinema: " + cinemaName +
        "\nTitle: " + filmTitle +
        "\nRow: " + row +
        "\nSeat: " + seat +
        "\nprice: " + price);
    }
    
    public static void main(String[] args){
        cinemaTicket c1 = new cinemaTicket("gladiator", 2, 33);
        
    }
    
    public cinemaTicket(String f,int r, int s){
        filmTitle = f;
        row = r;
        seat = s;
        calculatePrice();
        ticketData();
    }
}
