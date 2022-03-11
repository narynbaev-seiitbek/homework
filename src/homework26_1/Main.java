package homework26_1;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(100000,"01AAA111");
        Car car2 = new Car(100001,"01AAB112");
        Car car3 = new Car(100002,"01AAC113");
        Car car4 = new Car(100003,"01AAD114");
        Car car5 = new Car(100004,"01AAE115");

        CarsInfo carsInfo1 = new CarsInfo(LocalDate.of(2020,5,15),"Honda",7000,"Black");
        CarsInfo carsInfo2 = new CarsInfo(LocalDate.of(2019,6,16),"Toyota",6000,"White");
        CarsInfo carsInfo3 = new CarsInfo(LocalDate.of(2018,7,17),"Mercedes",5000,"Grey");
        CarsInfo carsInfo4 = new CarsInfo(LocalDate.of(2017,8,18),"Volvo",4000,"Green");
        CarsInfo carsInfo5 = new CarsInfo(LocalDate.of(2016,9,19),"Lexus",3000,"Blue");

        Map<Car,CarsInfo> carsInfoMap = new HashMap<>();
        carsInfoMap.put(car1,carsInfo1);
        carsInfoMap.put(car2,carsInfo2);
        carsInfoMap.put(car3,carsInfo3);
        carsInfoMap.put(car4,carsInfo4);
        carsInfoMap.put(car5,carsInfo5);

        printElementaryOfMap(carsInfoMap);
        System.out.println();

        Set<Car> keys = carsInfoMap.keySet();
        System.out.println(keys);

        List<CarsInfo> values = new ArrayList<>(carsInfoMap.values());
        System.out.println(values);
    }

    private static void printElementaryOfMap(Map<Car, CarsInfo> carsInfoMap) {
        for (Map.Entry entry: carsInfoMap.entrySet()) {
            System.out.println(entry);
        }
    }
}
