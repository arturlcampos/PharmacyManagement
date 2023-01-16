package com.devinpharmacy.pharmacymanagement.controller;

import com.devinpharmacy.pharmacymanagement.controller.dto.MedicamentoRequest;
import com.devinpharmacy.pharmacymanagement.controller.dto.MedicamentoResponse;
import com.devinpharmacy.pharmacymanagement.dataprovider.entity.MedicamentoEntity;
import com.devinpharmacy.pharmacymanagement.dataprovider.repository.MedicamentoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping(value = "/medicamento")
public class MedicamentoController {

    private MedicamentoRepository medicamentoRepository;

    public MedicamentoController(
            MedicamentoRepository medicamentoRepository
        )
    {
        this.medicamentoRepository = medicamentoRepository;
    }

    @GetMapping
    public ResponseEntity encontraMedicamento() {
        medicamentoRepository.save(new MedicamentoEntity(
                  "nome_medicamento",
                  "nome_laboratorio",
                  "dosagem_medicamento",
                  "descricao_medicamento",
                  "preco_un_medicamento",
                  "tip0_medicamento"
                )
        );
        List<MedicamentoEntity> entityList = medicamentoRepository.findAll();
        List<MedicamentoResponse> responseList = new ArrayList<>();
        for (MedicamentoEntity entity : entityList) {
            responseList.add(
                    new MedicamentoResponse(
                            entity.getNome_medicamento(),
                            entity.getNome_laboratorio(),
                            entity.getDescricao_medicamento(),
                            entity.getDosagem_medicamento(),
                            entity.getPreco_un_medicamento(),
                            entity.getTipo_medicamento())
            );
        }
        return ResponseEntity.ok(responseList);


    }

    @PostMapping
    public ResponseEntity salvaMedicamento(@RequestBody MedicamentoRequest medicamentoRequest){
        MedicamentoEntity entity = medicamentoRepository.save(new MedicamentoEntity(
                        medicamentoRequest.getNome_medicamento(),
                        medicamentoRequest.getNome_laboratorio(),
                        medicamentoRequest.getDescricao_medicamento(),
                        medicamentoRequest.getDosagem_medicamento(),
                        medicamentoRequest.getPreco_un_medicamento(),
                        medicamentoRequest.getTipo_medicamento()
                )
        );
        return  new ResponseEntity(
                new MedicamentoResponse(
                        entity.getNome_medicamento(),
                        entity.getNome_laboratorio(),
                        entity.getDescricao_medicamento(),
                        entity.getDosagem_medicamento(),
                        entity.getPreco_un_medicamento(),
                        entity.getTipo_medicamento()
                ),

                    HttpStatus.CREATED
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<MedicamentoResponse> atualizarMedicamentoPorId(
            @PathVariable Long id,
            @RequestBody MedicamentoRequest request

    ) {
        MedicamentoEntity entity = medicamentoRepository.findById(id).get();
        entity.setMedicamento(request.getNome_medicamento());
        entity.setMedicamento(request.getNome_laboratorio());
        entity.setMedicamento(request.getDosagem_medicamento());
        entity.setMedicamento(request.getDescricao_medicamento());
        entity.setMedicamento(request.getPreco_un_medicamento());
        entity.setMedicamento(request.getTipo_medicamento());
        medicamentoRepository.save(entity);

        return new ResponseEntity<MedicamentoResponse>(
                new MedicamentoResponse(
                        entity.getNome_medicamento(),
                        entity.getNome_laboratorio(),
                        entity.getDosagem_medicamento(),
                        entity.getDescricao_medicamento(),
                        entity.getPreco_un_medicamento(),
                        entity.getTipo_medicamento()),
                HttpStatus.OK
        );

    }
    @DeleteMapping
    public ResponseEntity<Object> deletaMedicamento(@RequestBody MedicamentoRequest medicamentoRequest){
        return ResponseEntity.ok(medicamentoRequest);
    }

}

