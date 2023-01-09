public class Isogram {
    
    public static boolean isogram(String x){
        char[] list = x.toCharArray();

        for (int i=0;i<list.length;i++){
            for (int k=0;k<list.length;k++){
                if (i==k){
                    continue;
                } else {
                    if (list[i]==list[k]){
                        return false;
                }}
            }
        }
        return true;
    }
}
