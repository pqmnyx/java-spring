//package com.db;
//
//
//import com.db.controllers.DialectsController;
//import com.db.controllers.PhrasesController;
//import com.db.controllers.RegionsController;
//import com.db.models.Dialects;
//import com.db.models.Phrases;
//import com.db.models.Regions;
//import com.db.repos.DialectsRepository;
//import com.db.repos.PhrasesRepository;
////import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.HashSet;
//import java.util.Set;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
////
////import static org.junit.jupiter.api.Assertions.assertEquals;
//
//@DataJpaTest
//public class ApplicationTest {
//
//    @Autowired
//    private DialectsRepository dialectsRepository;
//    @Autowired
//    private DialectsController dialectsController = new DialectsController();
//    private PhrasesController phrasesController = new PhrasesController();
//    private RegionsController regionsController = new RegionsController();
//
//    @Test
//    public void testAddDialects() {
//        Regions region1 = new Regions("Ярославская область");
//        Set<Regions> h = new HashSet<>();
//        h.add(region1);
//        Dialects dialect1 = new Dialects("Ярославский", h);
//
//        dialectsRepository.addDialect(dialect1);
//
//        Phrases phrase1 = new Phrases("поехать на зелёную", "выехать на природу", dialect1);
//        Phrases phrase2 = new Phrases("фраза", "значение", dialect1);
//
//        phrasesController.addPhrase(phrase1);
//        phrasesController.addPhrase(phrase2);
//        assertEquals(phrase1.getMeaning(), "выехать на природу");
//
//    }
//
//}
