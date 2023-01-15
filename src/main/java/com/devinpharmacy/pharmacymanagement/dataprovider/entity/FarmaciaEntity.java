package com.devinpharmacy.pharmacymanagement.dataprovider.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Entity
@Table (name="farmacia")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class FarmaciaEntity {


    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @NotNull
    @Column
    private String razaoSocial;

    @NotNull
    @Column
    private String cnpj;

    @NotNull
    @Column
    private String name;

    @NotNull
    @Column
    private String email;

    @NotNull
    @Column
    private String telefone;

    @NotNull
    @Column
    private String celular;

    @NotNull
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "endereco_id")
    private EnderecoEntity enderecoEntity;

}
