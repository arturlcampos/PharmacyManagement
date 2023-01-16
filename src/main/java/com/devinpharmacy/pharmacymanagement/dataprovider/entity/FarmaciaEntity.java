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

    public void setFarmacia(String nome_farmacia) {}

    public FarmaciaEntity (
            String razaoSocial,
            String cnpj,
            String name,
            String email,
            String telefone,
            String celular
    )
    {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.name = name;
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
    }
}
