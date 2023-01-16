package com.devinpharmacy.pharmacymanagement.dataprovider.repository;

import com.devinpharmacy.pharmacymanagement.dataprovider.entity.MedicamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicamentoRepository extends JpaRepository<MedicamentoEntity, Long> {

//    List<MedicamentoEntity> findByNome_medicamento(String nome_medicamento);
//
//    List<MedicamentoEntity> findByNome_laboratorio(String nome_laboratorio);
//
//    List<MedicamentoEntity> findByDosagem_medicamento(String dosagem_medicamento);
//
//    List<MedicamentoEntity> findByDescricao_medicamento(String descricao_medicamento);
//
//    List<MedicamentoEntity> findByPreco_un_medicamento(String preco_un_medicamento);
//
//    List<MedicamentoEntity> findByTipo_medicamento(String tipo_medicamento);



}
