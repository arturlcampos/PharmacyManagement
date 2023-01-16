package com.devinpharmacy.pharmacymanagement.controller;

import com.devinpharmacy.pharmacymanagement.controller.dto.FarmaciaRequest;
import com.devinpharmacy.pharmacymanagement.controller.dto.FarmaciaResponse;
import com.devinpharmacy.pharmacymanagement.dataprovider.entity.FarmaciaEntity;
import com.devinpharmacy.pharmacymanagement.dataprovider.repository.FarmaciaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping (value = "/farmacia")
public class FarmaciaController {

    public FarmaciaRepository farmaciaRepository;


    public FarmaciaController(
            FarmaciaRepository farmaciaRepository
        )
    {
        this.farmaciaRepository = farmaciaRepository;

    }

    @GetMapping
    public ResponseEntity encontraFarmacia() {
       farmaciaRepository.save (new FarmaciaEntity(
               "Clamed",
               "1231212333332232",
               "farma",
               "ex@gmail",
               "51-32498772",
               "51=998675433"
               )

       );

        List<FarmaciaEntity> entityList = farmaciaRepository.findAll();
        List<FarmaciaResponse> responseList = new ArrayList<>();
        for (FarmaciaEntity entity : entityList) {
            responseList.add(
                    new FarmaciaResponse(
                            entity.getRazaoSocial(),
                            entity.getCnpj(),
                            entity.getName(),
                            entity.getEmail(),
                            entity.getTelefone(),
                            entity.getCelular()
                    )
            );
        }
        return ResponseEntity.ok(responseList);


    }
    @PostMapping
    public ResponseEntity salvaFarmacia(@RequestBody FarmaciaRequest farmaciaRequest) {
        FarmaciaEntity entity = farmaciaRepository.save(new FarmaciaEntity(
                farmaciaRequest.getRazaoSocial(),
                farmaciaRequest.getCnpj(),
                farmaciaRequest.getName(),
                farmaciaRequest.getEmail(),
                farmaciaRequest.getTelefone(),
                farmaciaRequest.getCelular()
                )

        );
        return  new ResponseEntity(
                new FarmaciaResponse(
                        entity.getRazaoSocial(),
                        entity.getCnpj(),
                        entity.getName(),
                        entity.getEmail(),
                        entity.getTelefone(),
                        entity.getCelular()
                ),

                HttpStatus.CREATED
        );

    }
    @PutMapping("/{id}")
    public ResponseEntity<FarmaciaResponse> atualizarFarmaciaPorId(
            @PathVariable Long id,
            @RequestBody FarmaciaRequest request

    ) {
        FarmaciaEntity entity = farmaciaRepository.findById(id).get();
        entity.setFarmacia(request.getRazaoSocial());
        entity.setFarmacia(request.getCnpj());
        entity.setFarmacia(request.getName());
        entity.setFarmacia(request.getEmail());
        entity.setFarmacia(request.getTelefone());
        entity.setFarmacia(request.getCelular());
        farmaciaRepository.save(entity);

        return new ResponseEntity<FarmaciaResponse>(
                new FarmaciaResponse(
                        entity.getCelular(),
                        entity.getCnpj(),
                        entity.getName(),
                        entity.getEmail(),
                        entity.getTelefone(),
                        entity.getCelular()),
                HttpStatus.OK
        );

    }

    @DeleteMapping
    public ResponseEntity<Object> deletaFarmacia(@RequestBody FarmaciaRequest farmaciaRequest){
        return ResponseEntity.ok(farmaciaRequest);
    }
}
