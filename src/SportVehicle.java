import Strategy.Drive;
import Strategy.SpecialDrive;

public class SportVehicle extends Vehicle{
    public SportVehicle() {
        super(new SpecialDrive());
    }
}
