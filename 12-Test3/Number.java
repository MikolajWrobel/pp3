public class Number {
    private int system;
    private String value;

    public int getSystem() {
        return system;
    }
    public void setSystem(int system) {
        this.system = system;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public int get10(){
        int sum = 0;

        char[] chars = value.toCharArray();
        int[] ints = new int[chars.length];

        int potega = ints.length-1;

        for (int i=0;i<chars.length;i++){
            ints[i] = Character.getNumericValue(chars[i]);
        }

        for (int i=0;i<chars.length;i++){
            if (ints[i] >= system){
                return -1;
            }
        }
        for (int i=0;i<ints.length;i++){
            sum += ints[i]*Math.pow(system,potega);
            potega -= 1;
        }
        
        return sum;
    }
    
}
