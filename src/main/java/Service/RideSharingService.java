package Service;

import domain.Ride;
import domain.User;
import domain.Vehicle;

import java.util.List;

public interface RideSharingService {
    public void addUser(User user);
    public void addVehicle(Vehicle vehicle);
    public void offerRide(Ride ride);
    public List selectRides(String name, String origin, String destination, String rideType);
}
