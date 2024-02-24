package zely.parkinglot.model.vehicles;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import zely.parkinglot.model.ParkingTicket;

@DiscriminatorValue("truck")
@DiscriminatorColumn(name = "vehicle_type")
public class Truck extends Vehicle {

    @Override
    public void assignTicket(ParkingTicket ticket) {

    }
}
