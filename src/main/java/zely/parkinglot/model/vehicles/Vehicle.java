package zely.parkinglot.model.vehicles;

import zely.parkinglot.model.ParkingTicket;

public abstract class Vehicle {

    private Integer id;
    private String licensePlate;

    public abstract void assignTicket(ParkingTicket ticket);
}
