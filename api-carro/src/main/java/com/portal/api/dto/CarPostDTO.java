package com.portal.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude
//Objeto de transferencia de dados
public class CarPostDTO {

    private String modelo;

    private String marca;

    private String preco;

    private String descricao;

    private String versaoMotor;

    private String cidade;

    private String dataCriada;

    private long idproprietario;

    private String nomeProprietario;

    private String tipoProprietario;

    private String contato;


}
