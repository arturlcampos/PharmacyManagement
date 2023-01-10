package com.devinpharmacy.pharmacymanagement.repository;

import com.devinpharmacy.pharmacymanagement.entity.FarmaciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmaciaRepository extends JpaRepository<FarmaciaEntity, Long> {
}
