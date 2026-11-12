package com.example.projeto_escola.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.projeto_escola.configs.validations.NomeCursoValidation;

@NoArgsConstructor
@Data
@Builder
public class CursoRequestDTO {
    private Long id;
    @NotBlank(message = "O nome do curso é obrigatório")
    @NomeCursoValidation
    private String nome;
    @Min(value = 1, message = "A carga horária deve ser maior que 0")
    @Max(value = 5000, message = "A carga horária deve ser menor que 1000")
    private Integer cargaHoraria;
    private Long categoriaId;

    public CursoRequestDTO(Long id, String nome, Integer cargaHoraria, Long categoriaId) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.categoriaId = categoriaId;
    }
}
