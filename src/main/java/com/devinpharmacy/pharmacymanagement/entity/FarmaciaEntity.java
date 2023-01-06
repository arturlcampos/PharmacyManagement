package com.devinpharmacy.pharmacymanagement.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class FarmaciaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String razaoSocial;

    @NotNull
    private String cnpj;

    @NotNull
    private String name;

    @NotNull
    private String email;

    @NotNull
    private String telefone;

    @NotNull
    private String celular;

    @NotNull
    @JoinColumn(name = "id_endereco")
    private EnderecoEntity idendereco;

}
