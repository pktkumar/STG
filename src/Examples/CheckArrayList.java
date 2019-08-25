package Examples;

import java.util.ArrayList;

public class CheckArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> cars = new ArrayList<Integer>();
        cars.add(20);
        cars.add(40);
        cars.add(50);
        cars.add(60);
        System.out.println(cars.get(3));
    }

}
