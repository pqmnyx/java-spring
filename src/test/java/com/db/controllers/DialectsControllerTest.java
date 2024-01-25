package com.db.controllers;

import com.db.models.Dialects;
import com.db.models.Regions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DialectsControllerTest {

    private DialectsController dialectsController;
    private Dialects dialect1, dialect2;
    @MockBean
    private Regions region1;
    @BeforeEach
    void setUp() {
        region1 = new Regions("Ярославская область");
        Set<Regions> h = new HashSet<>();
        h.add(region1);
        dialect1 = new Dialects("Ярославский", h);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addDialect() {
    }

    @Test
    void getAllDialects() {
        assertEquals(List.of(region1),dialectsController.getAllDialects());
    }

    @Test
    void getAllDialectsByRegionId() {
    }

    @Test
    void findByName() {
    }
}