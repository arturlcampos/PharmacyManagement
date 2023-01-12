package com.devinpharmacy.pharmacymanagement.service;

import com.devinpharmacy.pharmacymanagement.dataprovider.entity.MedicamentoEntity;
import com.devinpharmacy.pharmacymanagement.dataprovider.repository.MedicamentoRepository;
import org.springframework.stereotype.Service;

@Service
public class MedicamentoService {

    private MedicamentoRepository repository;

    public  MedicamentoService(MedicamentoRepository repository){

        this.repository = repository;
    }
    public void salvamedicamento(MedicamentoEntity medicamento) {
        repository.save(medicamento);
    }


}
