package me.dio.academia.digital.entity.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaForm {

  @NotBlank(message = "Preencha o campo corretamente.")
  @Positive(message = "O id precisa ser positivo")
  private Long alunoId;

}
