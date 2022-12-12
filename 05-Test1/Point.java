public class Point {
    

    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;

    }

    public boolean isX(){
        return y == 0;
    }

    public boolean isY(){
        return x == 0;
    }

    public String toString(){
        String a = "";
        a = "P(" + x + "," + y + ")";
        return a;
    }
}
