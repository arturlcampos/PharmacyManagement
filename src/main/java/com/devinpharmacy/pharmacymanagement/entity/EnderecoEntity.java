package com.devinpharmacy.pharmacymanagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EnderecoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String cep;

    @NotNull
    private String logradouro;

    @NotNull
    private String numero;

    @NotNull
    private String bairro;

    @NotNull
    private String cidade;

    @NotNull
    private String estado;
    @NotNull
    private String complemento;

    @NotNull
    private String latitude;

    @NotNull
    private String longitude;
}
