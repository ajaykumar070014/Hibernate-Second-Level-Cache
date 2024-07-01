package com.L2cache.L2cache.service;

import com.L2cache.L2cache.entity.Citizen;

import java.util.List;
import java.util.Optional;

public interface CitizenService {
    Optional<Citizen> getCitizenById(int id);
    List<Citizen> getAllCitizen();
    Citizen createCitizen(Citizen citizen);

    Citizen updateCitizen(int id,Citizen citizen);
    void deteleCitizen(int id);
}