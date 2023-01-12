package com.devinpharmacy.pharmacymanagement.dataprovider.repository;

import com.devinpharmacy.pharmacymanagement.dataprovider.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
