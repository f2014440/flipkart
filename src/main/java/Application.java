import Service.RideSharingService;
import Service.RideSharingServiceImpl;
import domain.Ride;
import domain.User;
import domain.Vehicle;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Application {
    public static void main(String args[]) {
        RideSharingService rideSharingService = new RideSharingServiceImpl();
        rideSharingService.addUser(new User("rohan","M","36"));
        rideSharingService.addUser(new User("shashank","M","25"));
        rideSharingService.addVehicle(new Vehicle("rohan", "swift", "12345"));
        rideSharingService.addVehicle(new Vehicle("shashank", "baleno", "12756"));
        rideSharingService.offerRide(new Ride("rohan", "banglore", "hyderabad", new Date(2019, 01, 25, 8, 25, 00), 12, new Vehicle("rohan", "swift", "1275")));
        rideSharingService.offerRide(new Ride("shashank", "banglore", "hyderabad", new Date(2019, 04, 25, 10, 25, 00), 6, new Vehicle("shashank", "swift", "12345")));
        List<Ride> rides = rideSharingService.selectRides("abc", "banglore", "hyderabad", "Earliest");
        System.out.println(rides);
    }
}
