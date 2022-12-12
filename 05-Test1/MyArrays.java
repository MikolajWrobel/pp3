public class MyArrays {

    public static int odd(int[] array){
        int x = 0;

        for (int i=0; i < array.length; i++){
            if (array[i] > 0 && array[i] % 2 > 0){
                x += 1;
            }
        }


        return x;
    }
    

    public static int above(int[] array){
        int sum = 0;
        int sum2 = 0;
        for (int i=0; i < array.length; i++){
            sum += array[i];
        }

        double m = sum;
        double n = array.length;

        double arithmeticMean = m / n;

        for (int i=0; i < array.length; i++){
            if (array[i] > arithmeticMean){
                sum2 += array[i];
            }
        }
        
        return sum2;
    }


}
