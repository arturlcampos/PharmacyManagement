package com.devinpharmacy.pharmacymanagement.dataprovider.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Entity
@Table (name="endereco")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class EnderecoEntity {
    @Id
    @Column(name="id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column
    private String cep;

    @NotNull
    @Column
    private String logradouro;

    @NotNull
    @Column
    private Integer numero;

    @NotNull
    @Column
    private String bairro;

    @NotNull
    @Column
    private String cidade;

    @NotNull
    @Column
    private String estado;
    @NotNull
    @Column
    private String complemento;

    @NotNull
    @Column
    private String latitude;

    @NotNull
    @Column
    private String longitude;
}
