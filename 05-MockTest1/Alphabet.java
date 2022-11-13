public class Alphabet {
    

    public static boolean isAlphabet(String x){
        char[] array = x.toCharArray();

        for (int i=0; i<array.length; i++){
            if (i == array.length - 1){
                continue;
            }
            if (array[i] >= array[i+1]){
                return false;
            }
        }
        return true;  
       
    }
}

