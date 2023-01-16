package com.devinpharmacy.pharmacymanagement.controller;

import com.devinpharmacy.pharmacymanagement.controller.dto.UsuarioRequest;
import com.devinpharmacy.pharmacymanagement.controller.dto.UsuarioResponse;
import com.devinpharmacy.pharmacymanagement.dataprovider.entity.UsuarioEntity;
import com.devinpharmacy.pharmacymanagement.dataprovider.repository.UsuarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    public final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;

    }

    @GetMapping
    public ResponseEntity encontraUsuario(){
        usuarioRepository.save(new UsuarioEntity(
                "ex1@email.com",
                "senha1"
            )
        );

        List<UsuarioEntity> entityList = usuarioRepository.findAll();
        List<UsuarioResponse> responseList = new ArrayList<>();
        for (UsuarioEntity entity: entityList){
            responseList.add(
                    new UsuarioResponse(entity.getEmail(),entity.getSenha())
           );
        }
        return ResponseEntity.ok(responseList);

    }


    @PostMapping
    public ResponseEntity salvaUsuario(@RequestBody UsuarioRequest usuarioRequest){
        UsuarioEntity entity = usuarioRepository.save(new UsuarioEntity(
                usuarioRequest.getEmail(),
                usuarioRequest.getSenha()
        )
    );
        return  new ResponseEntity(
                new UsuarioResponse (
                        entity.getEmail(),
                        entity.getSenha()
                ),

                HttpStatus.CREATED
        );
    }
}



