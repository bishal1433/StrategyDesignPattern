import Strategy.Drive;
import Strategy.NormalDrive;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle() {
        super(new NormalDrive());
    }
}
