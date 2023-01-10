package com.devinpharmacy.pharmacymanagement.controller;

import com.devinpharmacy.pharmacymanagement.dto.UsuarioRequest;
import com.devinpharmacy.pharmacymanagement.dto.UsuarioResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @GetMapping()
    public UsuarioResponse encontraUsuario() {
        return new UsuarioResponse(
                "arturlcampos@gmail.com",
                "1234567890"
        );
    }

    @PostMapping
    public UsuarioRequest salvaUsuario(@RequestBody UsuarioRequest usuarioRequest) {
        return new UsuarioRequest(
                usuarioRequest.getEmail(),
                usuarioRequest.getSenha()
        );
    }
}