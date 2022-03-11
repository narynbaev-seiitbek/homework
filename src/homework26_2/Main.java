package homework26_2;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<City> city = new HashSet<>();

        city.add(new City(36,"Bishkek"));
        city.add(new City(39,"Karakol"));
        city.add(new City(32,"Osh"));
        city.add(new City(34,"Talas"));
        city.add(new City(35,"Naryn"));
        city.add(new City(3944,"Balykchy"));
        city.add(new City(3145,"Tokmok"));
        city.add(new City(3747,"Toktogul"));
        city.add(new City(3149,"Chuy"));

        printElementaryOfSet(city);
        System.out.println();
        Set<City> cities = getEvenCodeOfCity(city);
        printElementaryOfSet(cities);

    }

    private static void printElementaryOfSet(Set<City> cities) {
        for (City city1 : cities) {
            System.out.println(city1);
        }
    }

    private static Set<City> getEvenCodeOfCity(Set<City> city) {
        Set<City> cities = new TreeSet<>();
        for (City city1 : city) {
            if (city1.getCode()%2 ==0) {
                cities.add(city1);
            }
        }
        return cities;
    }
}
