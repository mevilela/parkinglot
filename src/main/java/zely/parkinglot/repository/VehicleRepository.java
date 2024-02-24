package zely.parkinglot.repository;

import org.springframework.data.repository.CrudRepository;
import zely.parkinglot.model.vehicles.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

}
