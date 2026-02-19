package com.example.service;

import com.example.entity.PricingLogEntity;
import com.example.repository.PricingLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class PricingLogService {

    @Autowired
    private PricingLogRepository pricingLogRepository;

    public void insert(PricingLogEntity pricingLog) {
        pricingLogRepository.save(pricingLog);
    }


    public Optional<PricingLogEntity> findById(int id) {
        return pricingLogRepository.findById(id);
    }

    public Iterable<PricingLogEntity> findAll() {
        return pricingLogRepository.findAll();
    }

    public void updatePricingLog(PricingLogEntity pricingLog) {
        pricingLogRepository.save(pricingLog);
    }

    public void deletePricingLog(PricingLogEntity pricingLog) {
        pricingLogRepository.delete(pricingLog);
    }


}
