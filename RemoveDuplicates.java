import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("London");
        cities.add("Lviv");
        cities.add("Lviv");
        cities.add("New York");
        cities.add("London");


        Set<String> uniqueCities = new HashSet<>(cities);




        System.out.println("Using for-each loop:");
        for (String city : uniqueCities) {
            System.out.println(city);
        }




        System.out.println("Loop with break:");
        int count = 0;
        for (String city : uniqueCities) {
            if (count >= uniqueCities.size()) {
                break;
            }
            System.out.println(city);
            count++;
        }


        System.out.println("Unique city name:");
        for (String city : uniqueCities) {
            char[] charArray = city.toCharArray();
            for (char ch : charArray) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

