public class Competition {
        int[] oceny;
        public Competition(int[] x) {
            oceny = x;
        }
        public int m() {
            int sum = 0;
            int max = oceny[0];
            int min = oceny[0];
            for (int ocena : oceny) {
                if (ocena > max) {max = ocena;}
                if (ocena < min) {min = ocena;}
            }
            for (int ocena : oceny) {
                sum += ocena;
            }
            sum -= max;
            sum -= min;
            return sum;
        }
    
        public static void main(String[] args) {
            int[] x = {2,3,4,5};
            System.out.println(Competition(x).m());
        }
    }
