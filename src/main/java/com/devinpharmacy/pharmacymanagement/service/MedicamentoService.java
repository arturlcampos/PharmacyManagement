package com.devinpharmacy.pharmacymanagement.service;

import com.devinpharmacy.pharmacymanagement.dataprovider.entity.MedicamentoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;


@Getter
@Setter
@NoArgsConstructor
@Service
public class MedicamentoService {

    private MedicamentoService repository;

    public  MedicamentoService(MedicamentoService repository){
        this.repository = repository;
    }
    public void save(MedicamentoEntity medicamentoEntity) {
        repository.save(medicamentoEntity);
    }


}
