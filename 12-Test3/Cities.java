import java.util.ArrayList;

public class Cities {

    private String[] cities;
    private ArrayList<String> matches = new ArrayList<>();

    Cities(String[] cities) {
        this.cities = cities;
    }
    public ArrayList<String> filter(char c) {
        
        for (String city : cities) {
            if (city.indexOf(c) == 0){
                matches.add(city);
            }
        }
        return matches;
    }

    public String cities(){
        String toString = "";
        for (int i=0;i<matches.size();i++){
            toString+=matches.get(i);
        }
        return toString;
    }
}