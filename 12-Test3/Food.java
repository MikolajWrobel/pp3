public abstract class Food {
    
    protected String name;
    protected float price;

    public Food(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public abstract void setPrice();

    
}
