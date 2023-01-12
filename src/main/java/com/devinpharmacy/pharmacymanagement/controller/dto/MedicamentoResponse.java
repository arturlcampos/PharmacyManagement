package com.devinpharmacy.pharmacymanagement.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class MedicamentoResponse {
    private String nome_medicamento;
    private String nome_laboratorio;
    private String dosagem_medicamento;
    private String descricao_medicamento;
    private String preco_un_medicamento;
    private String tipo_medicamento;

}
