package com.devinpharmacy.pharmacymanagement.service;

import com.devinpharmacy.pharmacymanagement.dataprovider.entity.FarmaciaEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
@Getter
@Setter
@NoArgsConstructor
@Service
public class FarmaciaService {


    private FarmaciaService repository;

    public  FarmaciaService(FarmaciaService repository){
        this.repository = repository;
    }
    public void save(FarmaciaEntity farmaciaEntity) {
        repository.save(farmaciaEntity);
    }
}
