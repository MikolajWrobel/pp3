public class Pizza extends Food implements Extra {
    
    private int size;

public Pizza(String name, int size){
    super(name);
    this.size = size;
}

public void setPrice(){
    price = size-10;
}

@Override
public float discount() {
    // TODO Auto-generated method stub
    if (price >= 30){
        return (float) (price*0.05);
    } 
    return 1;
}
@Override
public float delivery() {
    // TODO Auto-generated method stub
    if (size >= 50){
        return 8;
    }
    return 6;
}
@Override
public float delivery(int tip) {
    // TODO Auto-generated method stub
    return delivery()+tip;
}
}
