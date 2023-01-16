package com.devinpharmacy.pharmacymanagement.controller;

import com.devinpharmacy.pharmacymanagement.controller.dto.EnderecoRequest;
import com.devinpharmacy.pharmacymanagement.controller.dto.EnderecoResponse;
import com.devinpharmacy.pharmacymanagement.dataprovider.entity.EnderecoEntity;
import com.devinpharmacy.pharmacymanagement.dataprovider.repository.EnderecoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoController {

    private EnderecoRepository enderecoRepository;

    public EnderecoController(
            EnderecoRepository enderecoRepository
    ) {
        this.enderecoRepository = enderecoRepository;

    }
    @GetMapping
    public ResponseEntity encontraEndereco() {
        enderecoRepository.save(new EnderecoEntity(
                "90810-000",
                "Icaraí",
                "1122",
                "Cristal",
                "Porto Alegre",
                "RS",
                "Casa",
                "42512-67162",
                "38973-90923"
                )
        );

        List<EnderecoEntity> entityList = enderecoRepository.findAll();
        List<EnderecoResponse> responseList = new ArrayList<>();
        for (EnderecoEntity entity : entityList) {
            responseList.add(
                    new EnderecoResponse(
                            entity.getCep(),
                            entity.getLogradouro(),
                            entity.getNumero(),
                            entity.getBairro(),
                            entity.getCidade(),
                            entity.getEstado(),
                            entity.getComplemento(),
                            entity.getLatitude(),
                            entity.getLongitude())

            );
        }
            return ResponseEntity.ok(responseList);
    }



    @PostMapping
    public ResponseEntity salvaEndereco(@RequestBody EnderecoRequest enderecoRequest) {
            EnderecoEntity entity = enderecoRepository.save(new EnderecoEntity(
                enderecoRequest.getCep(),
                enderecoRequest.getLogradouro(),
                enderecoRequest.getNumero(),
                enderecoRequest.getBairro(),
                enderecoRequest.getCidade(),
                enderecoRequest.getEstado(),
                enderecoRequest.getComplemento(),
                enderecoRequest.getLatitude(),
                enderecoRequest.getLongitude())
        );
            return  new ResponseEntity(
                    new EnderecoResponse(
                            entity.getCep(),
                            entity.getLogradouro(),
                            entity.getNumero(),
                            entity.getBairro(),
                            entity.getCidade(),
                            entity.getEstado(),
                            entity.getComplemento(),
                            entity.getLatitude(),
                            entity.getLongitude()

                    ),

                    HttpStatus.CREATED
            );

    }
    @PutMapping("/{id}")
    public ResponseEntity<EnderecoResponse> atualizarMedicamentoPorId(
            @PathVariable Long id,
            @RequestBody EnderecoRequest request

    ) {
        EnderecoEntity entity = enderecoRepository.findById(id).get();
        entity.setEndereco(request.getCep());
        entity.setEndereco(request.getLogradouro());
        entity.setEndereco(request.getNumero());
        entity.setEndereco(request.getBairro());
        entity.setEndereco(request.getCidade());
        entity.setEndereco(request.getEstado());
        entity.setEndereco(request.getComplemento());
        entity.setEndereco(request.getLatitude());
        entity.setEndereco(request.getLongitude());
        enderecoRepository.save(entity);

        return new ResponseEntity<EnderecoResponse>(
                new EnderecoResponse(
                        entity.getCep(),
                        entity.getLogradouro(),
                        entity.getNumero(),
                        entity.getBairro(),
                        entity.getCidade(),
                        entity.getEstado(),
                        entity.getComplemento(),
                        entity.getLatitude(),
                        entity.getLongitude()),

                HttpStatus.OK
        );

    }



    @DeleteMapping
    public ResponseEntity<Object> deletaEndereco(@RequestBody EnderecoRequest enderecoRequest){
        return ResponseEntity.ok(enderecoRequest);
    }
}
