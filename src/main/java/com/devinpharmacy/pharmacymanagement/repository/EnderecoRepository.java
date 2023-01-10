package com.devinpharmacy.pharmacymanagement.repository;

import com.devinpharmacy.pharmacymanagement.entity.EnderecoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoEntity, Long> {
}
