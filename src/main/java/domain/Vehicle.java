package domain;

public class Vehicle {
    private final String ownerName;
    private final String vehicleName;
    private final String vehicleNumber;

    public Vehicle(String ownerName, String name, String number){
        this.ownerName = ownerName;
        this.vehicleName = name;
        this.vehicleNumber = number;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }
}
