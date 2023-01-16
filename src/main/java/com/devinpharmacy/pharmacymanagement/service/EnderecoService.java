package com.devinpharmacy.pharmacymanagement.service;

import com.devinpharmacy.pharmacymanagement.dataprovider.entity.EnderecoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@NoArgsConstructor
@Service
public class EnderecoService {



    private EnderecoService repository;

    public  EnderecoService(EnderecoService repository){
        this.repository = repository;
    }
    public void save(EnderecoEntity enderecoEntity) {
        repository.save(enderecoEntity);
    }
}
