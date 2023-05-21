package com.github.viniciusvk1.HibernateLessons.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "tb_usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 0, max = 50, message = "O nome deve conter o numero de 0 a 50 caracteres")
    private String nome;

    @NotBlank
    @Email
    @Size(min = 0, max = 60, message = "O email deve conter entre 0 a 60 caracteres")
    private String email;

    @NotBlank
    @Size(min = 9, max = 15, message = "O numero de telefone deve conter de 9 a 15 caracteres")
    private String telefone;

}