package com.devinpharmacy.pharmacymanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class UsuarioRequest {
    private String email;
    private String senha;

    }

