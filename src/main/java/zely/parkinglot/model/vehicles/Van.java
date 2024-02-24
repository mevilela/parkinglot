package zely.parkinglot.model.vehicles;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import zely.parkinglot.model.ParkingTicket;

@DiscriminatorValue("van")
@DiscriminatorColumn(name = "vehicle_type")
public class Van extends Vehicle {
    @Override
    public void assignTicket(ParkingTicket ticket) {

    }
}
