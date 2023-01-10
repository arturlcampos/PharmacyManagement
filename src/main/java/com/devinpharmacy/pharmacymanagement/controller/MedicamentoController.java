package com.devinpharmacy.pharmacymanagement.controller;

import com.devinpharmacy.pharmacymanagement.dto.MedicamentoRequest;
import com.devinpharmacy.pharmacymanagement.dto.MedicamentoResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicamento")
public class MedicamentoController {
    @GetMapping()
    public MedicamentoResponse getMedicamento() {
        return new MedicamentoResponse (
                "Dipirona",
                "OMS",
                "10ml",
                "Venda livre",
                "R$3,50",
                "Analgesico"
        );
    }
    @PostMapping
    public MedicamentoRequest salvaMedicamento(@RequestBody MedicamentoRequest medicamentoRequest) {
        return new MedicamentoRequest(
                medicamentoRequest.getNome_medicamento(),
                medicamentoRequest.getNome_laboratorio(),
                medicamentoRequest.getDosagem_medicamento(),
                medicamentoRequest.getDescricao_medicamento(),
                medicamentoRequest.getPreco_un_medicamento(),
                medicamentoRequest.getTipo_medicamento()
        );

    }
}
