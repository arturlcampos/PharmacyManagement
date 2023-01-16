package com.devinpharmacy.pharmacymanagement.service;

import com.devinpharmacy.pharmacymanagement.dataprovider.entity.UsuarioEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;


@Getter
@Setter
@NoArgsConstructor
@Service
public class UsuarioService {
    private UsuarioService repository;

    public UsuarioService(UsuarioService repository){
        this.repository = repository;
    }

    public void save(UsuarioEntity usuarioEntity){
        repository.save(usuarioEntity);

}


}
