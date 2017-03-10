package earth;

import java.util.Arrays;

/**
 * Created by Taras on 10.03.2017.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(Continent.EURASIA.name());
        System.out.println(Continent.ANTARCTICA.ordinal());
        System.out.println(Continent.NORTH_AMERICA.getDirection().toString());
        System.out.println(Continent.AFRICA.getDirection().equals(Continent.SOUTH_AMERICA.getDirection()));
        System.out.println(Continent.AUSTRALIA.hashCode());
        System.out.println(Continent.AFRICA.compareTo(Continent.EURASIA));
        System.out.println(Continent.NORTH_AMERICA.getDirection().getDeclaringClass());
        System.out.println(Continent.AUSTRALIA.valueOf("AUSTRALIA"));
        System.out.println(Arrays.toString(Continent.values()));

    }
}
