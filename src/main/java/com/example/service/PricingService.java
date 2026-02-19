package com.example.service;

import com.example.entity.Pricing;
import com.example.repository.PricingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.transaction.Transactional;
import java.util.Optional;

/**
 * Created by Wishwa Prabodha on 3/27/2018.
 */

@Transactional
@Service
public class PricingService {

    @Autowired
    private PricingRepository pricingRepository;


    @RequestMapping("")
    public Iterable<Pricing> getAllStock() {
        return pricingRepository.findAll();
    }

    public void insert(Pricing pricing) {
        pricingRepository.save(pricing);
    }


    public Iterable<Pricing> findAll() {
        return pricingRepository.findAll();
    }

    public Optional<Pricing> find(int id) {
        return pricingRepository.findById(id);
    }

    public void updatePricing(Pricing pricing) {
        pricingRepository.save(pricing);
    }

    public void deletePricing(Pricing pricing) {
        pricingRepository.delete(pricing);
    }


}
