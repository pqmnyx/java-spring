package com.db.controllers;

import com.db.models.Regions;
import com.db.repos.RegionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegionsController {
    @Autowired
    private RegionsRepository repository;

    public void save(Regions region) {
        repository.save(region);
    }
    public List<Regions> findRegionsByDialectsId_dialects(Integer id){
        return repository.findRegionsByDialectsId_dialects(id);
    }


}