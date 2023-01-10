package com.devinpharmacy.pharmacymanagement.controller;

import com.devinpharmacy.pharmacymanagement.dto.FarmaciaRequest;
import com.devinpharmacy.pharmacymanagement.dto.FarmaciaResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/farmacia")
public class FarmaciaController {

    @GetMapping()
    public FarmaciaResponse getFarmacia() {
        return new FarmaciaResponse (
                "Clamed",
                "12123231000187",
                "Farmacia Popular",
                "farpop@gmail.com",
                "51-32493871",
                "51-996268263",
                "endereco"
        );
    }
    @PostMapping
    public FarmaciaRequest salvaFarmacia(@RequestBody FarmaciaRequest farmaciaRequest) {
        return new FarmaciaRequest(
                farmaciaRequest.getRazaoSocial(),
                farmaciaRequest.getCnpj(),
                farmaciaRequest.getName(),
                farmaciaRequest.getEmail(),
                farmaciaRequest.getTelefone(),
                farmaciaRequest.getCelular(),
                farmaciaRequest.getId_endereco()

        );

    }
}
