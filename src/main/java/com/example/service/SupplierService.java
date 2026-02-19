package com.example.service;

import com.example.entity.Supplier;
import com.example.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public void insert(Supplier supplier) {
        supplierRepository.save(supplier);
    }


    public Optional<Supplier> findById(int id) {
        return supplierRepository.findById(id);
    }

    public Iterable<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    public void updateSupplier(Supplier supplier) {

        supplierRepository.save(supplier);
    }

    public void deleteSupplier(Supplier supplier) {

        supplierRepository.delete(supplier);
    }
}
