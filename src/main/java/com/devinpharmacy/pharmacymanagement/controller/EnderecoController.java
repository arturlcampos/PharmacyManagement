package com.devinpharmacy.pharmacymanagement.controller;

import com.devinpharmacy.pharmacymanagement.controller.dto.EnderecoRequest;
import com.devinpharmacy.pharmacymanagement.controller.dto.EnderecoResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController {


    @GetMapping
    public EnderecoResponse getEndereco() {
        return new EnderecoResponse(
                "90810-000",
                "Icaraí",
                "1122",
                "Cristal",
                "Porto Alegre",
                "RS",
                "Casa",
                "42512-67162",
                "38973-90923"
        );
    }

    @PostMapping
    public EnderecoRequest salvaEndereco(@RequestBody EnderecoRequest enderecoRequest) {
        return new EnderecoRequest(
                enderecoRequest.getCep(),
                enderecoRequest.getLogradouro(),
                enderecoRequest.getNumero(),
                enderecoRequest.getBairro(),
                enderecoRequest.getCidade(),
                enderecoRequest.getEstado(),
                enderecoRequest.getComplemento(),
                enderecoRequest.getLatitude(),
                enderecoRequest.getLongitude()
        );

    }
}
