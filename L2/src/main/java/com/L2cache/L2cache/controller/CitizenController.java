package com.L2cache.L2cache.controller;

import com.L2cache.L2cache.entity.Citizen;
import com.L2cache.L2cache.service.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/citizen")
public class CitizenController {
    @Autowired
    private CitizenService citizenService;
    @GetMapping("/{id}")
    public Optional<Citizen> getPersonById(@PathVariable int id) {
        return citizenService.getCitizenById(id);
    }
    @GetMapping
    public List<Citizen>getAllCitizen(){
        return citizenService.getAllCitizen();
    }

    @PostMapping
    public ResponseEntity<Citizen> createCitizen(@RequestBody Citizen citizen){
        Citizen createCitizen = citizenService.createCitizen(citizen);
        return ResponseEntity.ok(createCitizen);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Citizen> updateCitizen(@PathVariable int id, @RequestBody Citizen citizen) {
        Citizen updatedCitizen = citizenService.updateCitizen(id, citizen);
        return ResponseEntity.ok(updatedCitizen);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCitizen(@PathVariable int id){
        citizenService.deteleCitizen(id);
        return ResponseEntity.noContent().build();
    }

}
