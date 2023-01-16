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
    private String numero;

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

    public void setEndereco(String nome_endereco) {}

    public EnderecoEntity (
            String cep,
            String logradouro,
            String numero,
            String bairro,
            String cidade,
            String estado,
            String complemento,
            String latitude,
            String longitude
    )
    {
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.complemento = complemento;
        this.latitude = latitude;
        this.longitude = longitude;

    }
}
