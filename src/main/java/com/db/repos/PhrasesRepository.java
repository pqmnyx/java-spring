package com.db.repos;

import com.db.models.Dialects;
import com.db.models.Phrases;
import com.db.models.Regions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhrasesRepository extends JpaRepository<Phrases, Integer> {
    List<Phrases> findByPhrase(String phrase);
    List<Phrases> findPhrasesByDialects_Name(String name);
    void addPhrase(Phrases phrase);
}