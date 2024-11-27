import Strategy.Drive;

public class Vehicle {
    Drive obj;

    public Vehicle(Drive driveObj){
        this.obj=driveObj;
    }

    public void drive(){
        obj.drive();
    }
}
