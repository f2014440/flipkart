package domain;

import java.util.Date;

public class Ride {
    private final String riderName;
    private final String origin;
    private final String destination;
    private final Date startTime;
    private final Integer duration;
    private final Vehicle vehicle;



    public Ride(String riderName, String origin, String destination, Date startTime, Integer duration, Vehicle vehicle) {
        this.riderName = riderName;
        this.origin = origin;
        this.destination = destination;
        this.startTime = startTime;
        this.duration = duration;
        this.vehicle = vehicle;
    }
    public Ride(){
        this(null, null, null, null ,null, null);
    }
    public String getRiderName() {
        return riderName;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Integer getDuration() {
        return duration;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
