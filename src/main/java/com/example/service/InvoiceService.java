package com.example.service;

import com.example.entity.Invoice;
import com.example.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import java.util.Optional;

@Transactional
@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    public void insert(Invoice invoice) {
        invoiceRepository.save(invoice);
    }


    public Optional<Invoice> findById(int id) {
        return invoiceRepository.findById(id);
    }

    public Iterable<Invoice> findAll() {
        return invoiceRepository.findAll();
    }

    public void updateInvoice(Invoice invoice) {
        invoiceRepository.save(invoice);
    }

    public void deleteInvoice(Invoice invoice) {
        invoiceRepository.delete(invoice);
    }



}
