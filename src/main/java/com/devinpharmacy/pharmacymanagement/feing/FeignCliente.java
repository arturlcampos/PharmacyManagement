package com.devinpharmacy.pharmacymanagement.feing;

import com.devinpharmacy.pharmacymanagement.controller.dto.EnderecoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient (url = "http://viacep.com.br/ws/01001000/json/", name = "feign")
public interface FeignCliente {


    @GetMapping("{cep}/json")
    String buscaCep(@PathVariable("cep") String cep);

    @PostMapping("{cep}/json")
    String buscaCep(@RequestBody() EnderecoResponse cep);
};

