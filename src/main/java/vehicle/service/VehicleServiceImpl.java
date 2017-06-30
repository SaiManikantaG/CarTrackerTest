package vehicle.service;

import vehicle.entity.Vehicle;
import vehicle.exception.BadRequestException;
import vehicle.exception.ResourceNotFoundException;
import vehicle.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vehicle.entity.Vehicle;
import vehicle.exception.BadRequestException;
import vehicle.exception.ResourceNotFoundException;
import vehicle.repository.VehicleRepository;

import java.util.List;

/**
 * Created by sai on 6/25/17.
 */

@Service
public class VehicleServiceImpl implements VehicleService {


    @Autowired
    VehicleRepository repository;

    @Transactional
    public List<Vehicle> displayAll() {
        return repository.displayAll();
    }

    @Transactional
    public Vehicle displayOne(String vin) {
        Vehicle existing = repository.displayOne(vin);
        if (existing == null) {
            throw new ResourceNotFoundException("Vehicle with vin " + vin + " doesn't exist.");
        }
        return existing;
    }

    @Transactional
    public Vehicle create(Vehicle vin) {
        Vehicle existing = repository.displayOne(vin.getVin());
        if (existing != null) {
            throw new BadRequestException("Vehicle with Vin " + vin.getVin() + " already exists.");

        }
        return repository.create(vin);
    }

    @Transactional
    public Vehicle update(String vin, Vehicle vh) {
        Vehicle existing = repository.displayOne(vin);
        if (existing == null) {
            throw new ResourceNotFoundException("Vehicle with vin " + vin + " doesn't exist.");
        }
        return repository.update(vh);
    }

    @Transactional
    public void delete(String vin) {
        Vehicle existing = repository.displayOne(vin);
        if (existing == null) {
            throw new ResourceNotFoundException("Vehicle with vin " + vin + " doesn't exist.");
        }
        repository.delete(existing);
    }


}
