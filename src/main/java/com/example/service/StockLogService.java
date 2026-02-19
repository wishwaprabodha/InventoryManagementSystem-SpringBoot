package com.example.service;

import com.example.entity.StockLogEntity;
import com.example.repository.StockLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class StockLogService {
    @Autowired
    private StockLogRepository stockLogRepository;

    public void insert(StockLogEntity stockLog) {
        stockLogRepository.save(stockLog);
    }


    public Optional<StockLogEntity> findById(int id) {
        return stockLogRepository.findById(id);
    }

    public Iterable<StockLogEntity> findAll() {
        return stockLogRepository.findAll();
    }

    public void updateStockLog(StockLogEntity stockLog) {
        stockLogRepository.save(stockLog);
    }

    public void deleteStockLog(StockLogEntity stockLog) {
        stockLogRepository.delete(stockLog);
    }


}
