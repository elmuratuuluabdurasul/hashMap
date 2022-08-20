import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Car car1 = new Car(1,"A 0001 B");
        Car car2 = new Car(5,"A 0002 B");
        Car car3 = new Car(2,"1111 OSH");

        CarInfo carInfo1 = new CarInfo(2008, "Lexus",15000, "black");
        CarInfo carInfo2 = new CarInfo(2012, "BMW",12000, "white");
        CarInfo carInfo3 = new CarInfo(2016, "Toyota",20000, "white");

        Map<Car,CarInfo> map = new HashMap<>();
        map.put(car1, carInfo1);
        map.put(car2, carInfo2);
        map.put(car3, carInfo3);

        for(Map.Entry a: map.entrySet() ){
            System.out.println(a.getKey() + " " + a.getValue());
        }
    }
}
