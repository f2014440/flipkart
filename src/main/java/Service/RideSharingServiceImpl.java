package Service;

import domain.Ride;
import domain.User;
import domain.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RideSharingServiceImpl implements RideSharingService{
    private List<User> userDatabase = new ArrayList<User>();
    private HashMap<String, Vehicle> vehicleDtabase = new HashMap<String, Vehicle>();
    private List<Ride> offeredRides = new ArrayList<Ride>();
    public void addUser(User user){
        userDatabase.add(user);
    }

    @Override
    public void addVehicle(Vehicle vehicle) {
        vehicleDtabase.put(vehicle.getOwnerName(), vehicle);
    }

    @Override
    public void offerRide(Ride ride) {
        offeredRides.add(ride);
    }

    public List selectRides(String name, String origin, String destination, String rideType) {
        List<Ride> matchedRides = new ArrayList<>();
        for (Ride ride : offeredRides) {
            if (ride.getDestination().equals(destination) && ride.getOrigin().equals(origin)) {
                matchedRides.add(ride);
            }
        }
        if (matchedRides.isEmpty()) {
            System.out.println("no ride found");
            return new ArrayList();
        }
        long currentTime = System.currentTimeMillis();
        ArrayList<Ride> earliest = new ArrayList<>();
        if (rideType == "Earliest") {

            long minimum = Integer.MAX_VALUE;
            for (Ride ride : matchedRides) {
                long endTime = ride.getStartTime().getTime() + (ride.getDuration() * 3600 * 1000);
                if (currentTime - endTime <= minimum) {
                    earliest.add(ride);
                    minimum = currentTime - endTime;
                }

            }

        }
        if (rideType == "Fastest"){
            List<Ride> ridesWithMinimumDuration = new ArrayList<>();
            Integer minDuration = 9999;
            for (Ride ride: matchedRides){
                if (ride.getDuration() < minDuration){
                    minDuration = ride.getDuration();
                }
            }
            for (Ride ride:matchedRides){
                if (ride.getDuration()==minDuration){
                    earliest.add(ride);
                }
            }
        }
        return earliest;
    }
}
