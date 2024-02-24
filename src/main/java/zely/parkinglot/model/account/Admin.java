package zely.parkinglot.model.account;

import zely.parkinglot.model.parkingspots.ParkingSpot;

public class Admin extends Account{

    public boolean addParkingSpot(ParkingSpot spot);


    @Override
    public boolean resetPassword() {
        return false;
    }
}
