package com.devinpharmacy.pharmacymanagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/farmacia")
public class FarmaciaController {

    @GetMapping()
    public String getFarmacia() {
        return "Testando 1, 2, 3...SOMM!!";
    }
}
