public class Arrays {
   

    public static boolean arr(int[] arr1, int[] arr2){
        int counter1 = 0;
        int counter2 = 0;

        for (int i=0;i<arr1.length;i++){
            if (arr1[i]>9 && arr1[i]<100){
                counter1 += 1;
            }
        }

        for (int k=0;k<arr1.length;k++){
            if (arr2[k]>9 && arr2[k]<100){
                counter2 += 1;
            }
        }

        return counter1 == counter2;
    }

    public static void main(String[] args) {
        int[] arr1 = {1111,11,11};
        int[] arr2 = {2,22,22};
        System.out.println(arr(arr1,arr2));
    }




}
