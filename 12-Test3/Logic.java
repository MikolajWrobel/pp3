public class Logic {
    private boolean[] elements;

    public Logic(boolean[] elements){
        this.elements = elements;
    }

    public int opposite(){
        int counter = 0;
        for (int i=1;i<elements.length-1;i++){
            if (elements[i-1] != elements[i] && elements[i+1] != elements[i]){
                counter++;
            }
        }
        return counter;
    }
}
