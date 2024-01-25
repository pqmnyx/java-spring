package com.db.repos;
import com.db.models.Dialects;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DialectsRepository extends JpaRepository<Dialects, Integer> {
    List<Dialects> findByName(String name);
    List<Dialects> findDialectsByRegionsId_regions(Integer id_regions);
    Dialects addDialect(Dialects dialect);
//    @Transactional
//    void deleteBy(long id_dialects);
}