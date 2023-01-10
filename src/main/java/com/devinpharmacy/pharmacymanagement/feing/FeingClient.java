package com.devinpharmacy.pharmacymanagement.feing;

import com.devinpharmacy.pharmacymanagement.dto.EnderecoResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


//@org.springframework.cloud.openfeing.FeingClient(url="https://viacep.com.br/ws/", name = "opaa")

public interface FeingClient {
    @GetMapping("{cep}/json") // https://viacep.com.br/ws/01001000/json
    String buscaCep(@PathVariable("cep") String cep); //01001000

    @PostMapping("{cep}/json") // https://viacep.com.br/ws/01001000/json
    String buscaCep(@RequestBody() EnderecoResponse cep); //01001000
}
