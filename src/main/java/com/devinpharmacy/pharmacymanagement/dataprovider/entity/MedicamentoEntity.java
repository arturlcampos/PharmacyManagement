package com.devinpharmacy.pharmacymanagement.dataprovider.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.jetbrains.annotations.NotNull;

@Entity
@Table (name="medicamento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class MedicamentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medicamentoId", nullable = false)
    private Long id;

    @NotNull
    @Column
    private String nome_medicamento;
    @NotNull
    @Column
    private String nome_laboratorio;
    @NotNull
    @Column
    private String dosagem_medicamento;
    @NotNull
    @Column
    private String descricao_medicamento;
    @NotNull
    @Column
    private String preco_un_medicamento;

    @NotNull
    @Column
    private String tipo_medicamento;

    public void setMedicamento(String nome_medicamento) {

    }

    public MedicamentoEntity (
            String nome_medicamento,
            String nome_laboratorio,
            String dosagem_medicamento,
            String descricao_medicamento,
            String preco_un_medicamento,
            String tipo_medicamento
        )
    {
        this.nome_medicamento = nome_medicamento;
        this.nome_laboratorio = nome_laboratorio;
        this.dosagem_medicamento = dosagem_medicamento;
        this.descricao_medicamento = descricao_medicamento;
        this.preco_un_medicamento = preco_un_medicamento;
        this.tipo_medicamento = tipo_medicamento;
    }
}

