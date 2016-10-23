package edu.eci.cosw.sharepark.repositories;

import edu.eci.cosw.sharepark.entities.Parking;
import edu.eci.cosw.sharepark.entities.ParkingId;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by diego on 22/10/16.
 */
public interface ParkingsRepository extends JpaRepository<Parking,ParkingId> {


}
