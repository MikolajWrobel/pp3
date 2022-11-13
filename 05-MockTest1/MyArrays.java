class MyArrays {

    public static int even(int[] array){
        int counter = 0;
        for (int i=0; i < array.length; i++){
            if (array[i] % 2 == 0){
                counter += 1;
            }
    
        }
        return counter;
    }


    public static int positiveOdds(int[] array){
        int counter = 0;
        for (int i=0; i < array.length; i++){
            if (array[i] > 0 && array[i] % 2 == 0){
                    counter += 1;
                }
        }
       return counter;
    }


    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        System.out.println(MyArrays.even(array));
    }
}