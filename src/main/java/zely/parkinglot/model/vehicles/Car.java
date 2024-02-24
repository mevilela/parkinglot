package zely.parkinglot.model.vehicles;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import zely.parkinglot.model.ParkingTicket;

//essas anotações são para identificar as classes filhas no hibernate, adicionando os valores de cada classe filha dentro da tabela Vehicle
@DiscriminatorValue("car")
@DiscriminatorColumn(name = "vehicle_type")
public class Car extends Vehicle {

    @Override
    public void assignTicket(ParkingTicket ticket) {
      if (ticket == null){
          throw new RuntimeException("parking ticket is required");
      }

    }
}
