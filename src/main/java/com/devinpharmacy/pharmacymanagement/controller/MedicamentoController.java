package com.devinpharmacy.pharmacymanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicamento")
public class MedicamentoController {
    @GetMapping()
    public String getMedicamento() {
        return "Testando 1, 2, 3...SOMMM!!";
    }

}
