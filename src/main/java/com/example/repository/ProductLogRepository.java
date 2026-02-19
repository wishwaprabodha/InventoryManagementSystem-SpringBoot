package com.example.repository;

import com.example.entity.ProductLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jakarta.persistence.criteria.CriteriaBuilder;

@Repository
public interface ProductLogRepository extends JpaRepository<ProductLogEntity,Integer>{
}
