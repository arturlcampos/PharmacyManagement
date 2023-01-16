package com.devinpharmacy.pharmacymanagement.dataprovider.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Entity
@Table (name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name =  "usuarioId",nullable = false)
    private Long id;

    @Column
    @NotNull
    private String email;


    @Column
    @NotNull
    private String senha;

    public UsuarioEntity (
            String email,
            String senha
        )
    {
        this.email = email;
        this.senha = senha;
    }

}