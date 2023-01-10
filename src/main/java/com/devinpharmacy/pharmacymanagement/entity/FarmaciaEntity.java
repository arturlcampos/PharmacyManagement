package com.devinpharmacy.pharmacymanagement.entity;

import jakarta.persistence.*;
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
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "id_endereco")
    private EnderecoEntity enderecoEntity;

}
