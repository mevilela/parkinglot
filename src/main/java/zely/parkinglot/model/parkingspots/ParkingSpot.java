package zely.parkinglot.model.parkingspots;

import zely.parkinglot.model.vehicles.Vehicle;

public abstract class ParkingSpot {

    private Integer id;
    private boolean isFree;

    private Vehicle vehicle;

    public boolean getIsFree(); //implementar

    public abstract boolean assignVehicle(Vehicle vehicle);

    public boolean removeVehicle() {
        return //todo
    }
}
