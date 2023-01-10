package com.devinpharmacy.pharmacymanagement.repository;

import com.devinpharmacy.pharmacymanagement.entity.MedicamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentoRepository extends JpaRepository<MedicamentoEntity, Long> {
}
