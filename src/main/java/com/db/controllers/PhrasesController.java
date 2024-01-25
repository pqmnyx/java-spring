package com.db.controllers;

import com.db.models.Dialects;
import com.db.models.Phrases;
import com.db.repos.DialectsRepository;
import com.db.repos.PhrasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhrasesController {
    @Autowired
    public DialectsController dialectsController;
    public RegionsController regionsController;

    private PhrasesRepository repository;

    public Phrases addPhrase(Phrases phrase) {
        return repository.save(phrase);
    }
}
