import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> ls = new ArrayList<>();

        ls.add(new OffRoadVehicle());
        ls.add(new PassengerVehicle());
        ls.add(new SportVehicle());


        for(Vehicle s:ls){
            s.drive();
        }
    }
}