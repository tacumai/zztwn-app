package com.zztwndemo.springboot.controllers;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zztwndemo.springboot.entities.CustomerEntity;
import com.zztwndemo.springboot.repositories.CustomerRepository;

@RestController
public class customerController {
	
	@Autowired
	CustomerRepository repo;

    @RequestMapping(value="/", method = RequestMethod.GET)
	public Iterable<CustomerEntity> index() {
    		Iterable<CustomerEntity> customers = repo.findAll();
		return customers; 
	}
    
    //@RequestMapping(value="/", method = RequestMethod.POST)
    //@Transactional(readOnly=false)
    //public Iterable<CustomerEntity> newCustomer() {
    //}
    
    @PostConstruct
    public void init() {
    		CustomerEntity user1 = new CustomerEntity();
    		user1.setName("ほげ");
    		repo.saveAndFlush(user1);

    		CustomerEntity user2 = new CustomerEntity();
		user2.setName("ふが");
    		repo.saveAndFlush(user2);

    }
    
}
