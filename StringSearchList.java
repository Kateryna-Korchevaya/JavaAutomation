import java.util.List;
import java.util.ArrayList;

public class StringSearchList {
    public static boolean containsString(List<String> list, String searchString) {
        for (String element : list) {
            if (element.equals(searchString)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Lviv");
        cities.add("New York");

        String searchString = "Lviv";

        boolean result = containsString(cities, searchString);
        System.out.println("Is '" + searchString + "' in the list? " + result);
    }

}
