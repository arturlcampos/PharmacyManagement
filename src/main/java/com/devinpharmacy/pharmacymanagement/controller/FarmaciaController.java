package com.devinpharmacy.pharmacymanagement.controller;

import com.devinpharmacy.pharmacymanagement.controller.dto.FarmaciaRequest;
import com.devinpharmacy.pharmacymanagement.controller.dto.FarmaciaResponse;
import com.devinpharmacy.pharmacymanagement.dataprovider.repository.EnderecoRepository;
import com.devinpharmacy.pharmacymanagement.dataprovider.repository.FarmaciaRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (value = "/farmacia")
public class FarmaciaController {

    public final FarmaciaRepository farmaciaRepository;
    private final EnderecoRepository enderecoRepository;

    public FarmaciaController(FarmaciaRepository farmaciaRepository, EnderecoRepository enderecoRepository){
        this.farmaciaRepository = farmaciaRepository;
        this.enderecoRepository = enderecoRepository;
    }

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
