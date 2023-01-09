public class Numbers {
    
    public int[] integers;

    public Numbers(int[] integers){
        this.integers = integers;
    }

    public boolean ok(){

        for (int i=0;i<integers.length;i++){
            if (i % 2 == 0){
                if (integers[i] % 2 != 0){
                    return false;
                }
            } else {
                if (integers[i] % 2 == 0){
                    return false;
                }

            }
        }
        return true;
    }


}
