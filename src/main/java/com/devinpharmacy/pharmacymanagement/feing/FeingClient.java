package com.devinpharmacy.pharmacymanagement.feing;

import com.devinpharmacy.pharmacymanagement.controller.dto.EnderecoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public interface FeingClient {
    @GetMapping("{cep}/json")
    String buscaCep(@PathVariable("cep") String cep);

    @PostMapping("{cep}/json")
    String buscaCep(@RequestBody() EnderecoResponse cep);
};
