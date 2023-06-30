package com.mvdb.movieDB.dtos;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
//Records são imutáveis
public record MovieRecordDto( /* Rows do Banco de Dados -> */ @NotBlank String name, @NotNull BigDecimal value) {
    //Validação dos dados
}
