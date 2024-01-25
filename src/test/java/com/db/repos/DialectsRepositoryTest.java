//package com.db.repos;
//
//import com.db.models.Dialects;
//import com.db.models.Regions;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class DialectsRepositoryTest {
//
//    @Autowired
//    private DialectsRepository dialectsRepository;
//    private Dialects dialect1, dialect2;
//    private Regions region1;
//
//    @BeforeEach
//    void setUp() {
//        region1 = new Regions("Ярославская область");
//        Set<Regions> h = new HashSet<>();
//        h.add(region1);
//        dialect1 = new Dialects("Ярославский", h);
//    }
//
//    @AfterEach
//    void tearDown() {
//    }
//
//    @Test
//    void findByName() {
//    }
//
//    @Test
//    void findDialectsByRegionsId_regions() {
//    }
//}