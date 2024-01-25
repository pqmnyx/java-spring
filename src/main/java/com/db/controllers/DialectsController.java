package com.db.controllers;

import com.db.models.Dialects;
import com.db.repos.DialectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DialectsController {
    @Autowired
    private DialectsRepository repository;

    public Dialects addDialect(Dialects dialects) {
        return repository.save(dialects);
    }

    public List<Dialects> getAllDialects() {
        return (List<Dialects>) repository.findAll();
    }

    public List<Dialects> getAllDialectsByRegionId(Integer id) {
        return repository.findDialectsByRegionsId_regions(id);
    }

    public List<Dialects> findByName(String name) {
        return repository.findByName(name);
    }
}

//
//public class CustomerService {
//    @Autowired
//    private CustomerRepository repository;
//
//    public void test() {
//        // Save a new customer
//        Customer newCustomer = new Customer();
//        newCustomer.setFirstName("John");
//        newCustomer.setLastName("Smith");
//
//        repository.save(newCustomer);
//
//        // Find a customer by ID
//        Optional<Customer> result = repository.findById(1L);
//        result.ifPresent(customer -> System.out.println(customer));
//
//        // Find customers by last name
//        List<Customer> customers = repository.findByLastName("Smith");
//        customers.forEach(customer -> System.out.println(customer));
//
//        // List all customers
//        Iterable<Customer> iterator = repository.findAll();
//        iterator.forEach(customer -> System.out.println(customer));
//
//        // Count number of customer
//        long count = repository.count();
//        System.out.println("Number of customers: " + count);
//    }
