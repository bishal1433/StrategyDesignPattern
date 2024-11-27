import Strategy.Drive;
import Strategy.NormalDrive;
import Strategy.SpecialDrive;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SpecialDrive());
    }
}
