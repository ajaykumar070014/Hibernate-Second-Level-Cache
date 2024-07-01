package com.L2cache.L2cache.service.imp;

import com.L2cache.L2cache.entity.Citizen;
import com.L2cache.L2cache.repository.CitizenRepository;
import com.L2cache.L2cache.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CitizenServiceImp implements CitizenService {
    @Autowired
    private CitizenRepository citizenRepository;
    @Override
    public Optional<Citizen> getCitizenById(int id) {
        return citizenRepository.findById(id);
    }

    @Override
    public List<Citizen> getAllCitizen() {
        return citizenRepository.findAll();
    }

    @Override
    public Citizen createCitizen(Citizen citizen) {
        return citizenRepository.save(citizen);
    }

    @Override
    public Citizen updateCitizen(int id, Citizen citizen) {
        Citizen citizen1 = citizenRepository.findById(id).orElseThrow(null);
        if (citizen1!=null){
            citizen1.setName(citizen.getName());
            citizen1.setAddress(citizen.getAddress());
            return citizenRepository.save(citizen1);
        }
        return null;
    }

    @Override
    public void deteleCitizen(int id) {
        citizenRepository.deleteById(id);
    }
}
