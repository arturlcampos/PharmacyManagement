package com.devinpharmacy.pharmacymanagement.dataprovider.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name =  "id",nullable = false)
    private Long id;


    @Column
    private String email;


    @Column
    private String senha;

    public UsuarioEntity (String email, String senha){
        this.email = email;
        this.senha = senha;
    }

}