package com.db.repos;

import com.db.models.Dialects;
import com.db.models.Regions;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionsRepository extends JpaRepository<Regions, Integer> {
    List<Regions> findByRegion(String region);
    List<Regions> findRegionsByDialectsId_dialects(Integer id_dialects);
}