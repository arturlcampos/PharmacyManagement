package com.devinpharmacy.pharmacymanagement.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class FarmaciaResponse {
    private String razaoSocial;
    private String cnpj;
    private String name;
    private String  email;
    private String telefone;
    private String celular;
    private String id_endereco;

}
