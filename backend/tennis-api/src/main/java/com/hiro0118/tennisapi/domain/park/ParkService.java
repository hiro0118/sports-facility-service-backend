package com.hiro0118.tennisapi.domain.park;

import com.hiro0118.tennisapi.domain.park.entities.ParkEntity;
import com.hiro0118.tennisapi.domain.park.repositoryinterface.IParkRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkService {

    private final IParkRepository repository;

    public ParkService(IParkRepository repository) {
        this.repository = repository;
    }

    public List<ParkEntity> getParks() {
        return repository.getParks();
    }
}
